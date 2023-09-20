package seminars.seminar12;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User testUser;

    @BeforeEach
    void preparedData() {
        testUser = new User( 0,0, "test@ya.ru", "Nik", "My name?");
    }

    @org.junit.jupiter.api.Test
    void getUserIdUserTest() {
    }

    @org.junit.jupiter.api.Test
    void setUserIdUserTest() {
    }

    @org.junit.jupiter.api.Test
    void getHashUserTest() {
    }

    @org.junit.jupiter.api.Test
    void setHashUserTest() {
    }

    @org.junit.jupiter.api.Test
    void getEmailUserTest() {
    }

    @org.junit.jupiter.api.Test
    void setEmailUserTest() {
    }

    @org.junit.jupiter.api.Test
    void getLoginUserTest() {
        // User testUser = new User( 0,0, "test@ya.ru", "Nik", "My name?");
        assertEquals( "Nik", testUser.getLogin() );
    }

    @org.junit.jupiter.api.Test
    void setLoginUserTest() {
        // User testUser = new User( 0,0, "test@ya.ru", "Nik", "My name?");
        testUser.setLogin( "Andr" );
        assertEquals( "Nik", testUser.getLogin() );
    }
    @org.junit.jupiter.api.Test
    void setLoginUserTestIsEmpty() {
        User testUser = new User( 0,0, "test@ya.ru", "", "My name?");
        testUser.setLogin( "Andr" );
        assertEquals( "Andr", testUser.getLogin() );
    }

    @org.junit.jupiter.api.Test
    void getQuestionUserTest() {
    }

    @org.junit.jupiter.api.Test
    void setQuestionUserTest() {
    }
}