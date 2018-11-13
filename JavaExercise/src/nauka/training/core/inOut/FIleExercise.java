package nauka.training.core.inOut;

import java.io.*;

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

        //obsługa plików binarnych - zapisywanie bajt po bajcie

        String filePathBinaryWrite = "D:\\java\\JavaExercise\\src\\nauka\\training\\core\\inOut\\FileBinary.txt";
        int number3 = 1234567;
        DataOutputStream outputStream = null;

        try{
            outputStream = new DataOutputStream(new FileOutputStream(filePathBinaryWrite));
            outputStream.writeInt(number3);
        } finally{
            if (outputStream != null){
                outputStream.close();
            }
        }

        // czytanie plików binarnych

        String filePathBinaryRead = "D:\\java\\JavaExercise\\src\\nauka\\training\\core\\inOut\\FileBinary.txt";
        int number4 = 0;
        DataInputStream inputStream = null;

        try {
            inputStream = new DataInputStream(new FileInputStream(filePathBinaryRead));
            number4 = inputStream.readInt();
            System.out.println(number4);
            System.out.println();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
