package seminars.seminar6.application;

import seminars.seminar6.domain.MovieReview;
import seminars.seminar6.domain.MovieSearchRequest;

import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Приложение, которое будет что-то делать. Не структурная, а именно изменяемая бизнес-логика
 */
public class MovieApp implements Consumer<MovieSearchRequest> {
    private IFetchMovieReviews fetchMovieReviews;
    private IPrintMovieReviews printMovieReviews;
    private static Random rand = new Random();

    public MovieApp(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        this.fetchMovieReviews = fetchMovieReviews;
        this.printMovieReviews = printMovieReviews;
    }
    private List<MovieReview> filterRandomReviews(List<MovieReview> movieReviewList) {
        List<MovieReview> result = new ArrayList<>();
        // logic to return random reviews
        for (int index = 0; index < 5; index++) {
            if (movieReviewList.size() < 1)
                break;
            int randomIndex = getRandomElement(movieReviewList.size());
            MovieReview movieReview = movieReviewList.get(randomIndex);
            movieReviewList.remove(movieReview);
            result.add(movieReview);
        }
        return result;

    }  // Логика всего приложения. Почистить, убрать плохие, т.е. воздействуем на ответ, который был прислан с репозитория
    private int getRandomElement(int size) {return rand.nextInt(size);}
    public  void accept(MovieSearchRequest movieSearchRequest) {
        List<MovieReview> movieReviewList = fetchMovieReviews.fetchMovieReviews(movieSearchRequest);  // Запрос к хранилищу оценок фильмов.
        List<MovieReview> randomReviews = filterRandomReviews( new ArrayList<>(movieReviewList) );  // Бизнес-Логика, то есть фильтрация
        printMovieReviews.writeMovieReviews(randomReviews);  // Вывод логики на ConcolePrinter
    }  // Метод выполняющий логику.
}
