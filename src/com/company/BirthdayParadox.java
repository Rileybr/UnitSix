// By Brandon Riley
// 1/7/2020
// simulates the birthday paradox 1000 times and prints the percentage of times it is correct
package com.company;

public class BirthdayParadox {
    public static boolean hasDupes(int[] list){
        // goes through an array and checks if there is a duplicate in the array
        for (int i = 0; i < list.length; i++){
            for (int x = list.length-1; x > i; x--){
                if (list[i]==list[x]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] dates(int num){
        // creates an array of random numbers between 0 and 364 which represents a day of the year
        int[] list = new int[num];
        for (int i = 0; i < num; i++){
            int x = (int)(Math.random() * 364);
            list[i] = x;
        }
        return list;
    }

    public static void main(String[] args){
        int correct = 0; // count variable
        for (int i = 0; i < 1000; i++){ // simulates the birthday paradox 1000 times
            int[] array = new int[23];
            array = dates(23);
            if (hasDupes(array)){
                correct++;
            }
        }
        double Answer = (double)correct/10; // changes the count from a whole number to a percentage
        System.out.println("The percent of times there were duplicate birthdays is " + Answer + "%.");
    }
}
