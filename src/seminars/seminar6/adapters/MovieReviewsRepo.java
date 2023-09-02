package seminars.seminar6.adapters;

import seminars.seminar6.application.IFetchMovieReviews;
import seminars.seminar6.domain.MovieReview;
import seminars.seminar6.domain.MovieSearchRequest;

import java.util.*;

/**
 * Репозитарий, где хранятся оценки фильмов
 */
public class MovieReviewsRepo implements IFetchMovieReviews {
    private Map<String, List<MovieReview>> movieReviewMap;  // Репозитарий с данными
    public MovieReviewsRepo() { initialize();}  // Инициализация
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {
        return Optional.ofNullable( movieReviewMap.get(movieSearchRequest.getMovieName()) ).orElse( new ArrayList<>() );
    }  // Интерфейс - по факту это порты
    private void initialize() {
        this.movieReviewMap = new HashMap<>();
        movieReviewMap.put("StarWars", Collections.singletonList( new MovieReview( "1", 7.5, "Excellent" ) ));
        movieReviewMap.put( "StarTreck", Arrays.asList( new MovieReview( "1", 9.5, "Excellent" ), new MovieReview("1", 8.5, "Good") ) );  // Выделение памяти, создание списка. Добавление в список фильмов
    }
}
