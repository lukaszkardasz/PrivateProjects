package nauka.training.core.inOut;

import java.io.FileWriter;
import java.io.IOException;

class FIleExercise {



    public static void main(String[] args) throws IOException {
        String filePath = "D:\\java\\JavaExercise\\src\\nauka\\training\\core\\inOut\\File.txt";
        int number = 12345678;
        FileWriter fileWriter = null;


        try{
            fileWriter = new FileWriter(filePath);
            fileWriter.write(Integer.toString(number));
        } finally{
            if(fileWriter != null){
                fileWriter.close();
            }
        }
    }
}
