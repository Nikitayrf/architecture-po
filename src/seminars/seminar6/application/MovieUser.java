package seminars.seminar6.application;

import seminars.seminar6.domain.MovieSearchRequest;

/**
 * Контейнер, поступающий от пользователя, который будет использоваться для вызова логики, для соединения портов между собой
 */
public class MovieUser {
    private IUserInput userInputDriverPort;
    public MovieUser(IUserInput userInputDriverPort) {
        this.userInputDriverPort = userInputDriverPort;
    }
    public void processInput(MovieSearchRequest movieSearchRequest){
        userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}
