package seminars.seminar6.domain;

/**
 * Продукт, который хочет получить пользователь. Часть Домена
 */
public class MovieReview {
    String movieName;  // Имя фильма на который получили отзыв
    double movieStore;  // Оценка фильма
    String remark;  // Комментарий на фильм

    public MovieReview(String s, double v, String excellent) {
        this.movieName = s;
        this.movieStore = v;
        this.remark = excellent;
    }

    @Override
    public String toString() {
        return " " + movieStore + " " + remark;  // Переопределяем, так как будем использовать ConsolePrinter
    }
}
