package seminars.seminar6.domain;

import seminars.seminar6.application.MovieApp;

/**
 * Модель общей логики, структура. Ядро
 */
public class Model {
    private MovieApp movieApp;  // Создаём экземпляр ядра программы

    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }
    public void Run(MovieSearchRequest movieSearchRequest) {
        movieApp.accept(movieSearchRequest);
    }  // Статическая функция, принять запрос от пользователя, запрос который пользователь ввёл. Запуск бизнес-логики приложения
}
