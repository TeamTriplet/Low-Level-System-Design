package BookMyShowModule;

import BookMyShowModule.Enums.City;
import BookMyShowModule.Enums.SeatType;
import BookMyShowModule.Movie.Movie;
import BookMyShowModule.Movie.MovieController;
import BookMyShowModule.Payment.CardPayment;
import BookMyShowModule.Theatre.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookMyShowApp {
    MovieController movieController;
    TheatreController theatreController;

    public BookMyShowApp() {
        movieController = new MovieController();
        theatreController = new TheatreController();
        initialize();
    }

    public void createBooking(City city, String movieName){
        Set<Movie> movieSet = this.movieController.getMovieByCity(city);
        Movie desiredMovie = null;
        for(Movie movie : movieSet){
            if(movie.getName().equalsIgnoreCase(movieName)) desiredMovie = movie;
        }

        Map<Theatre, List<Show>> theatreSet = theatreController.getAllShowsByMovie(city, desiredMovie);

        //4. select the particular show user is interested in
        Map.Entry<Theatre,List<Show>> entry = theatreSet.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        Booking booking = new Booking(interestedShow, new CardPayment());
        List<Seat> seatList = selectSeat();
        booking.bookShow(seatList);
    }

    private void initialize() {
        //create movies
        createMovies();

        //create theater with screens, seats and shows
        createTheatre();
    }

    private void createMovies() {

        //create Movies1
        Movie avengers = new Movie(1, "AVENGERS", 128);

        //create Movies2
        Movie baahubali = new Movie(2, "BAAHUBALI", 180);

        //add movies against the cities
        movieController.addMovie(avengers, City.BANGALORE);
        movieController.addMovie(avengers, City.DELHI);
        movieController.addMovie(baahubali, City.BANGALORE);
        movieController.addMovie(baahubali, City.DELHI);
    }

    //creating 2 theatre
    private void createTheatre() {
        Movie avengerMovie = movieController.getMovieByName("AVENGERS");
        Movie baahubali = movieController.getMovieByName("BAAHUBALI");

        Theatre inoxTheatre = new Theatre();
        inoxTheatre.setId(1);
        inoxTheatre.setScreens(createScreen());
        inoxTheatre.setCity(City.BANGALORE);
        List<Show> inoxShows = new ArrayList<>();
        Show inoxMorningShow = createShows(1, inoxTheatre.getScreens().get(0), avengerMovie, 8);
        Show inoxEveningShow = createShows(2, inoxTheatre.getScreens().get(0), baahubali, 16);
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inoxTheatre.setShowList(inoxShows);

        Theatre pvrTheatre = new Theatre();
        pvrTheatre.setId(2);
        pvrTheatre.setScreens(createScreen());
        pvrTheatre.setCity(City.DELHI);
        List<Show> pvrShows = new ArrayList<>();
        Show pvrMorningShow = createShows(3, pvrTheatre.getScreens().get(0), avengerMovie, 13);
        Show pvrEveningShow = createShows(4, pvrTheatre.getScreens().get(0), baahubali, 20);
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        pvrTheatre.setShowList(pvrShows);

        theatreController.addTheatre(inoxTheatre, City.BANGALORE);
        theatreController.addTheatre(pvrTheatre, City.DELHI);
    }

    private List<Screen> createScreen() {

        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setId(1);
        screen1.setSeatController(createSeatController());
        screens.add(screen1);

        return screens;
    }

    private Show createShows(int showId, Screen screen, Movie movie, int showStartTime) {

        Show show = new Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setStartTime(showStartTime); //24 hrs time ex: 14 means 2pm and 8 means 8AM
        return show;
    }

    private SeatController createSeatController(){
        SeatController seatController = new SeatController();
        seatController.addSeats(SeatType.SILVER,50);
        seatController.addSeats(SeatType.GOLD,50);
        seatController.addSeats(SeatType.PLATINUM,50);
        return seatController;
    }

    private List<Seat> selectSeat(){
        List<Seat> seatList = new ArrayList<>();
        seatList.add(new Seat(30));
        seatList.add(new Seat(60));
        seatList.add(new Seat(120));
        return seatList;
    }
}

