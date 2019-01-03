package nauka.training.jUnit;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testExamples
{
    private Assertions Assert;

    @Test
    public void wordIsNotEmpty()
    {
        String word = "Franek";
        Assert.assertFalse(word.isEmpty());
    }

    @Test
    public void wordIsEqualToSelfUppercase()
    {
        String input = "Ala";
        String expected = "ALA";
        assertEquals(expected, input.toUpperCase());
    }

    @Test
    public void listContainsParticularWord_isMinLenghtOf3()
    {
        List<String> list = Arrays.asList("Jan", "Julek", "Franek", "John", "Bob", "Ala");
        assertTrue(list.size() > 2);
        assertTrue(list.contains("Ala"), "List without Ala");
    }





}
