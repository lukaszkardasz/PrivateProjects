package nauka.training.Basics;

import static nauka.training.Basics.RepeatedString.repeatedString;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author n2god on 09/05/2019
 * @project PrivateProjects
 */
class RepeatedStringTest {


    @org.junit.jupiter.api.Test
    void shouldSayAisThere5Times() {
        String testString = "adab";
        assertEquals(repeatedString(testString, 10), 5);
    }

    @org.junit.jupiter.api.Test
    void shouldSayAisThereMillionTimes() {
        String testString = "a";
        assertEquals(repeatedString(testString, 1000000000000L), 1000000000000L);
    }

}