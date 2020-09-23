package de.neuefische.maven;

public class SecondCalculator {

    public static int secondcalculator (int value1, int value2) {
        return value1 + value2;
    }

    public static void main(String[] args) {
        int value1 = 3;
        int value2 = 6;
        System.out.println(secondcalculator(value1,value2));
        System.out.println(isGreaterThan100(value1));
    }

    public static boolean isGreaterThan100 (int value1){
        return value1 > 100;
    }
}
