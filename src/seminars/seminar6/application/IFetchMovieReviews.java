package seminars.seminar6.application;

import seminars.seminar6.domain.MovieReview;
import seminars.seminar6.domain.MovieSearchRequest;

import java.util.List;

/**
 * Порт - интерфейс взаимодействия с адаптерами
 */
public interface IFetchMovieReviews {
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);  // Метод запрашивает из репозитория всё содержимое и выдавать всё Revies которые запросили. Параметр MovieSearchRequest - те фильмы которые мы ищем
}
