package seminars.seminar6.domain;

/**
 * Контейнер, содержащий запрос пользователя. Часть домена
 */
public class MovieSearchRequest {
    String request;

    public MovieSearchRequest(String name) {
        this.request = name;
    }

    public String getMovieName() {
        return request;
    }
}
