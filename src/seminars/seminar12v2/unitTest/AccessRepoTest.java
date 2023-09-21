package seminars.seminar12v2.unitTest;

import org.junit.jupiter.api.Test;
import seminars.seminar12v2.AccessRepo;
import seminars.seminar12v2.Group;
import seminars.seminar12v2.User;

import static org.junit.jupiter.api.Assertions.*;

class AccessRepoTest {

    @Test
    void getUser() {
        User userTest = new User( "Nikita" );
        AccessRepo accessRepoTest = new AccessRepo( userTest, new Group( "Архитектура ПО" ) );
//        AccessRepo accessRepoTest = new AccessRepo( new User( "Nikita" ), new Group( "Архитектура ПО" ) );
//        assertEquals( new User( "Nikita" ), accessRepoTest.getUser() );
        assertEquals( userTest, accessRepoTest.getUser() );
    }

    @Test
    void setUser() {
        AccessRepo accessRepoTest = new AccessRepo( new User( "Nikita" ), new Group( "Архитектура ПО" ) );
        User userTest = new User( "Art Nikita" );
        accessRepoTest.setUser( userTest );
        assertEquals(userTest, accessRepoTest.getUser());  // no mistake
//        assertEquals( new User( "Nikr" ), accessRepoTest.getUser() );  // mistake

    }

    @Test
    void getGroup() {
        Group groupTest = new Group( "Архитектура ПО" );
        AccessRepo accessRepoTest = new AccessRepo( new User( "Nikita" ), groupTest );
        assertEquals( groupTest, accessRepoTest.getGroup() );
    }

    @Test
    void setGroup() {
    }
}