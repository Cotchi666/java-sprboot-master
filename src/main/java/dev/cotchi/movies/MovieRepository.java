package dev.cotchi.movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //return null unless there is moi
    Optional<Movie> findMovieByImdbId(String imdbId);
}
