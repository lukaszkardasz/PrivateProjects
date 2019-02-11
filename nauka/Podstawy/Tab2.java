package nauka.Podstawy;

import java.util.Arrays;

class Tab2 {

    public static void main(String[] args) {

        int[] tableWithNumbersUpToOneHundred;
        tableWithNumbersUpToOneHundred = new int[10];
        int counter = 10;
        while (counter < 110) {
            for (int i = 0; i <= tableWithNumbersUpToOneHundred.length-1; i++) {
                tableWithNumbersUpToOneHundred[i] = counter;
                counter += 10;
            }
        }
        //System.out.println(Arrays.toString(tableWithNumbersUpToOneHundred));

        /*
        1 2 3 4 5 6 7 8 9 10
        2 4 6 8 10 12 14 16 18 20
        3
        4
        5
        6
        7
        8
        9
        */

/*        for (int wiersz = 1; wiersz <=10; wiersz++){
            for(int kolumna = 1; kolumna <=10; kolumna++ ){
                System.out.print(kolumna * wiersz + " ");
            }
            System.out.println();
        }*/
        for (int i = 0; i<= 10; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }


    }
}
