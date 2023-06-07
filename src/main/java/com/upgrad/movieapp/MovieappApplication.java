package com.upgrad.movieapp;

import com.upgrad.movieapp.dao.CityDao;
import com.upgrad.movieapp.dao.CustomerDAO;
import com.upgrad.movieapp.dao.MovieDAO;
import com.upgrad.movieapp.dao.TheatreDAO;
import com.upgrad.movieapp.entities.City;
import com.upgrad.movieapp.entities.Customer;
import com.upgrad.movieapp.entities.Theatre;
import com.upgrad.movieapp.services.CityService;
import com.upgrad.movieapp.services.MovieService;
import com.upgrad.movieapp.services.TheatreService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


@RestController
@SpringBootApplication
public class MovieappApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MovieappApplication.class, args);

		CustomerDAO customerDAO = context.getBean(CustomerDAO.class);
		CityDao cityDao = context.getBean(CityDao.class);
		MovieDAO movieDAO = context.getBean(MovieDAO.class);
//
//		Customer customer = new Customer();
//		City city = new City();
//
//		customer.setFirstName("Shravan");
//		customer.setLastName("Ashok");
//		customer.setDateOfBirth(LocalDateTime.of(1995,06,16,9,0));
//		customer.setUserName("shrvnash");
//		customer.setPassword("16061995");
//
//		System.out.println("Before Saving: "+customer);
//		Customer savedCustomer = customerDAO.save(customer);
//		System.out.println("After Saving: "+savedCustomer);
//
//		customer.setPassword("18071969");
//		Customer updatedCustomer = customerDAO.update(customer);
//		System.out.println("After Updating Customer: "+updatedCustomer);
//
//		Customer retrievedCustomer = customerDAO.findById(customer.getCustomerId());
//		System.out.println("Retrieved Customer: "+retrievedCustomer);
//
//		city.setCityName("Bangalore");
//		cityDao.save(city);
//		city.setCityName("Chennai");
//		cityDao.save(city);
//		city.setCityName("Mumbai");
//
//		System.out.println("Before Saving: "+city);
//		City savedCity = cityDao.save(city);
//		System.out.println("After Saving: "+savedCity);
//
//		City retrievedCity = cityDao.findById(city.getCityId());
//		System.out.println("Retrieved City: "+retrievedCity);

//    MovieDao movieDao = context.getBean(MovieDao.class);
//    Movie movie = new Movie();
//    movie.setMovieName("Avengers: Infinity War");
//    movie.setMovieDescription("The Avengers must stop Thanos, an intergalactic warlord, " +
//        "from getting his hands on all the infinity stones.");
//    movie.setReleaseDate(LocalDateTime.of(2018, 4, 27, 5, 30));
//    movie.setDuration(150);
//    movie.setCoverPhotoUrl("cover-photo-url");
//    movie.setTrailerUrl("trailer-url");
//
//    System.out.println("Before Saving: " + movie);
//
//    Movie savedMovie = movieDao.save(movie);
//    System.out.println("After saving: " + savedMovie);
//
//    Movie retrievedMovie = movieDao.findById(savedMovie.getMovieId()).orElse(null);
//    System.out.println("After retrieving: " + retrievedMovie);
//
//    movie.setDuration(160);
//    Movie updatedMovie = movieDao.save(movie);
//    System.out.println("After updating: " + updatedMovie);
//
//    movieDao.delete(updatedMovie);
//    System.out.println("After deleting: " + movieDao.findById(updatedMovie.getMovieId()));

//		TheatreDAO theatreDao = context.getBean(TheatreDAO.class);
//
//		Theatre theatre1 = new Theatre();
//		theatre1.setTheatreName("Urvashi Cinema");
//		theatre1.setTicketPrice(500);
//
//		Theatre theatre2 = new Theatre();
//		theatre2.setTheatreName("Cinepolis Multiplex");
//		theatre2.setTicketPrice(600);
//
//		Theatre theatre3 = new Theatre();
//		theatre3.setTheatreName("PVR Koramangla");
//		theatre3.setTicketPrice(550);
//
//		Theatre theatre4 = new Theatre();
//		theatre4.setTheatreName("PVR IMAX");
//		theatre4.setTicketPrice(700);
//
//		Theatre theatre5 = new Theatre();
//		theatre5.setTheatreName("INOX");
//		theatre5.setTicketPrice(400);
//
//		List<Theatre> theatres = Arrays.asList(theatre1, theatre2, theatre3, theatre4, theatre5);
//		theatreDao.saveAll(theatres);


		//		MovieService movieService = context.getBean(MovieService.class);
//
//		System.out.println("Movie Service bean : "+ movieService);
//
//		Movie movie1 = new Movie();
//		movie1.setMovieName("Avengers");
//		movie1.setMovieDescription("It is superheroes movie");
//		movie1.setReleaseDate(LocalDateTime.of(2020,11,04,23,12));
//    movie1.setCoverPhotoUrl("photo url");
//    movie1.setTrailerUrl("trailer url");
//    movie1.setDuration(120);
//
//
//    Movie savedMovie  = movieService.acceptMovieDetails(movie1);
//
//		System.out.println(savedMovie);
//
//		Movie searchedMovie = movieService.getMovieDetails(savedMovie.getMovieId());
//		System.out.println("Searched movie : "+ searchedMovie);

		CityService cityService = context.getBean(CityService.class);
		TheatreService theatreService = context.getBean(TheatreService.class);
	}

}