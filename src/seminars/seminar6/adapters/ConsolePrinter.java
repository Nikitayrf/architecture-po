package seminars.seminar6.adapters;

import seminars.seminar6.application.IPrintMovieReviews;
import seminars.seminar6.domain.MovieReview;

import java.util.List;

/**
 * Адаптер, будет печатать из БД, ответы на запросы, ревью о фильме и т.д.
 * ConsolePrinter implements IPrintMovieReviews - это значит порт подключен (подключение к интерфейсу) к адаптеру (по факту внешний класс)
 */
public class ConsolePrinter implements IPrintMovieReviews {
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach( movieReview -> {
            System.out.println(movieReview.toString());
        } );  // Адаптер вывода печати в консоль
    }
}
