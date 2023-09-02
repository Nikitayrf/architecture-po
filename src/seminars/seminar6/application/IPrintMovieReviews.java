package seminars.seminar6.application;

import seminars.seminar6.domain.MovieReview;

import java.util.List;

/**
 * Порт - интерфейс для адаптера ConsolePrinter
 */
public interface IPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);  // Запись отображения пользователю
}
