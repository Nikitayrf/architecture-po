package seminars.seminar6;

import seminars.seminar6.adapters.ConsolePrinter;
import seminars.seminar6.adapters.MovieReviewsRepo;
import seminars.seminar6.adapters.UserCommand;
import seminars.seminar6.application.IFetchMovieReviews;
import seminars.seminar6.application.IPrintMovieReviews;
import seminars.seminar6.application.IUserInput;
import seminars.seminar6.application.MovieUser;
import seminars.seminar6.domain.MovieSearchRequest;

public class Main {
    public static void main(String[] args) {
        IFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo();  // Создание объект репозитария с фильмами
        IPrintMovieReviews printMovieReviews = new ConsolePrinter();  // Создание принтера
        IUserInput userCommand = new UserCommand( fetchMovieReviews, printMovieReviews );  // Создание объект адаптера пользователя, то что должны в ядре программы выполнить

        MovieUser movieUser = new MovieUser( userCommand );  // Создание пользователя, в который вкладывается контейнер
        MovieSearchRequest starWarRequest = new MovieSearchRequest( "StarWars" );  // Создание сущности поиска. Т.е. найти ревью на StarWars. Подготовили данные
        MovieSearchRequest starTrackRequest = new MovieSearchRequest( "StarTreck" );

        System.out.println("Displaying reviews for movie " + starTrackRequest.getMovieName());  // Процессинг, запуск логики программы
        movieUser.processInput( starTrackRequest );
        System.out.println("Displaying reviews for movie " + starWarRequest.getMovieName());
        movieUser.processInput( starWarRequest );
    }
}
