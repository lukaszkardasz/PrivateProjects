package javastart_exercises.lotery_statistics;

public class Result {
    private int[] numbers;
    private int megaBall;

    private Result(int[] numbers, int megaBall) {
        this.numbers = numbers;
        this.megaBall = megaBall;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getMegaBall() {
        return megaBall;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void setMegaBall(int megaBall) {
        this.megaBall = megaBall;
    }

    static Result fromCsv(String lineFromCsv){
        String[] columns = lineFromCsv.split(",");
        String[] winningNumbers = columns[1].split(" ");
        int winLength = winningNumbers.length;
        int[] winningNumbersInt = new int[winLength]; //tablica o ilości równej liczbie losowań
        for (int i = 0; i < winLength; i++) {
            winningNumbersInt[i] = Integer.parseInt(winningNumbers[i]);
        }

        int megaBall = Integer.parseInt(columns[2]);
        return new Result(winningNumbersInt, megaBall);
    }
}
