package dev.cotchi.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository repository;
    public List<Movie> findAllMovies(){
        return repository.findAll();

    }
    public Optional<Movie> findAllMovieByImdbId(String imdbId){
        return repository.findMovieByImdbId(imdbId);
    }
}
