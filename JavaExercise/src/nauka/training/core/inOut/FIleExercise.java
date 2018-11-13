package nauka.training.core.inOut;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FIleExercise {



    public static void main(String[] args) throws IOException {

        // write to file
        String filePathWrite = "D:\\java\\JavaExercise\\src\\nauka\\training\\core\\inOut\\File.txt";
        int number = 12345678;
        FileWriter fileWriter = null;


        try{
            fileWriter = new FileWriter(filePathWrite);
            fileWriter.write(Integer.toString(number));
        } finally{
            if(fileWriter != null){
                fileWriter.close();
            }
        }

        //read from file

        String filePathRead = "D:\\java\\JavaExercise\\src\\nauka\\training\\core\\inOut\\File2.txt";
        int number2 = 0;
        BufferedReader fileReader = null;

        try{
            fileReader = new BufferedReader( (new FileReader(filePathRead)));
            String numberAsString = fileReader.readLine();
            number2 = Integer.parseInt(numberAsString);
            System.out.println(number2);
        } finally {
            if (fileReader != null){
                fileReader.close();
            }
        }






    }
}
