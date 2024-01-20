package BookMyShowModule.Movie;

import BookMyShowModule.Enums.City;

import java.util.*;
public class MovieController {

    Map<City, Set<Movie>> cityVsMovieList;
    Set<Movie> movieSet;

    public MovieController() {
        this.cityVsMovieList = new HashMap<>();
        this.movieSet = new HashSet<>();
    }

    public void addMovie(Movie movie, City city){
        movieSet.add(movie);
        Set<Movie> set = this.cityVsMovieList.get(city);
        if(set == null) {
            set = new HashSet<>();
        }
        set.add(movie);
        this.cityVsMovieList.put(city, set);
    }

    public Set<Movie> getMovieByCity(City city){
        if(this.cityVsMovieList.containsKey(city)) return this.cityVsMovieList.get(city);
        return null;
    }

    public Movie getMovieByName(String movieName){
        for(Movie movie : movieSet){
            if(movie.getName().equalsIgnoreCase(movieName)) return movie;
        }
        return null;
    }
}
