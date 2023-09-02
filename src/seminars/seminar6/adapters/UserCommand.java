package seminars.seminar6.adapters;

import seminars.seminar6.application.IFetchMovieReviews;
import seminars.seminar6.application.IPrintMovieReviews;
import seminars.seminar6.application.IUserInput;
import seminars.seminar6.application.MovieApp;
import seminars.seminar6.domain.Model;
import seminars.seminar6.domain.MovieSearchRequest;

/**
 * Внешний адаптер
 */
public class UserCommand implements IUserInput {
    private Model model;
    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp( fetchMovieReviews, printMovieReviews );
        this.model = new Model( movieApp );
    }  // Интерфейс
    public void handleUserInput(Object userCommand) {model.Run( (MovieSearchRequest)userCommand );}  // Вызов содержимого команды, какая логика должна быть выполнена из команды. Извлечение и соединение ропизитория и хранилищем оценок фильмов и принтера, при наличии запроса
}
