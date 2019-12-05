package com.company;

public class ArrayCreation {
    public static double getAverage(double[] numbers){
         if (numbers.length < 3){
             return 0.0;
         }
         else {
             double start = numbers[0];
             double middle = numbers[numbers.length/2];
             double end = numbers[numbers.length-1];
             return (start+middle+end)/3;
         }
    }
    public static String stringArray(String[] friends){
        if (friends.length != 5){
            return "";
        }
        else {
            String output = "";
            for (int i = 0; i < 5; i++){
                output += friends[i].length();
                output += " ";
            }
            return output;
        }
    }
    public static String countryData(){
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana", "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi", "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi", "Swahili", "Spanish", "English", "French", "English"};

        int x = (int)(Math.random() * capitals.length);
        return "The capital of " + countries[x] + " is " + capitals[x] + " and the primary language is " + languages[x];
    }
    public static void main(String[] args){
        //double[] numbers = {89, 75};
        //System.out.println(getAverage(numbers));

        //String[] names = {"Athos", "Porthos", "Aramis"};
        //System.out.println(stringArray(names));

        //System.out.print(countryData());
    }
}
