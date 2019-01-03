package nauka.training.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExample
{
    private static String regex;
    private static String input;

    public static void main(String[] args) {

        String str = "Lukasz";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        String str2 = "lukasz";
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.substring(2,4));
        String str3 = "abrakadabra";
        System.out.println(str3.replace("b","r"));
        System.out.println(str.concat(str3));
        String str4 = "Java;to;fajny;jezyk;programowania";
        String tab1[] = null;
        String tab2[] = null;
        tab1 = str4.split(";");
            for (String i :tab1) {
                System.out.println(i);
            }
        System.out.println("_________");
        tab2 = str4.split(";",2);
        String str5 = tab2[1].replace(";", " ");
        System.out.println(str5);
        String str6 = "Lukasz ";
        System.out.println(str6.trim());

        firstToUpperCase(str2);





/*        simpleRegexMatch();
        exaclyOneWord();
        testSentenceWithoutNumbers();
        passwordTest();
        replaceWordInSentence();
        removeSpaces();*/

    }

    private static String firstToUpperCase(String str2) {
        String result = null;
        String firstLetter = String.valueOf(str2.charAt(0)).toUpperCase();
        String rest = str2.substring(1);
        result = firstLetter.concat(rest);
        return result;
    }


    private static void removeSpaces() {
        input = "    Ala     ma  kota    .";
        regex = " +";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String newSent = matcher.replaceAll(" ");
        System.out.println(input);
        System.out.println(newSent);
        bar();
    }

    private static void replaceWordInSentence() {
        input = "Cats are very nice until don't meet other cat.";
        regex = "cat";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        String newSent = matcher.replaceAll("dog");
        System.out.println(newSent);
        bar();
    }

    private static void passwordTest() {
        input = "GGaaa12$";
        regex = "[a-zA-Z_0-9!@#]";
        System.out.println("Times: " + runTest(regex, input));
        bar();
    }

    private static void testSentenceWithoutNumbers() {
        regex = "\\d"; //to sprawdza czy to jest liczba
        input = "Ola ma trzy koty i 2 psy";
        System.out.println("Is present number? : " + (runTest(regex, input)));
        bar();
    }

    private static void exaclyOneWord() {
        regex = "\\W+Ola\\W+"; //sprawdzanie czy jedno słowo oddzielone spacjami wystepuje w zdaniu
        input = "K.ola,ma polanka a      Ola    nie";
        System.out.println("Times: " + runTest(regex, input));
        bar();
    }

    private static void simpleRegexMatch() {
        regex = "ala"; //sprawdza czy wystepuje pojedynczy ciag znakow
        input = "Ala ma kota alasika z alabamy";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Is there: " + matcher.find());
        System.out.println("times: " + runTest(regex, input));
        bar();
    }

    private static int runTest(String reg, String text)
    {
        //ile razy ten tekst wystąpi w wyrażeniu i przechowyje ilość wystąpień w zmiennej matches
        int matches = 0;
        Pattern pattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
        {
            matches++;
        }

        return matches;
    }

    private static void bar(){
        System.out.println("_______________");
    }
}
