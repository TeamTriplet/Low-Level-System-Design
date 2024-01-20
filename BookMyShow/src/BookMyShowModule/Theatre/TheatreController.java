package BookMyShowModule.Theatre;

import BookMyShowModule.Enums.City;
import BookMyShowModule.Movie.Movie;

import java.util.*;
public class TheatreController {
    Map<City, Set<Theatre>> cityVsTheatreList;
    Set<Theatre> theatreSet;

    public TheatreController(){
        cityVsTheatreList = new HashMap<>();
        theatreSet = new HashSet<>();
    }

    public void addTheatre(Theatre theatre, City city){
        theatreSet.add(theatre);
        Set<Theatre> set = this.cityVsTheatreList.get(city);
        if(set == null) {
            set = new HashSet<>();
        }
        set.add(theatre);
        this.cityVsTheatreList.put(city, set);
    }

    public Set<Theatre> getTheatreByCity(City city){
        if(this.cityVsTheatreList.containsKey(city)) return this.cityVsTheatreList.get(city);
        return null;
    }

    public Map<Theatre, List<Show>> getAllShowsByMovie(City city, Movie movie){
        Map<Theatre, List<Show>> allShowsByMovie = new HashMap<>();
        Set<Theatre> theatres = cityVsTheatreList.get(city);
        for(Theatre theatre : theatres){
            List<Show> showList = new ArrayList<>();

            for(Show show : theatre.getShowList()){
                if(show.getMovie().getName().equalsIgnoreCase(movie.getName())){
                    showList.add(show);
                }
            }
            if(!showList.isEmpty()) allShowsByMovie.put(theatre, showList);
        }
        return allShowsByMovie;
    }
}
