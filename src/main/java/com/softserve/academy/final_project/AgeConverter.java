package com.softserve.academy.final_project;

public class AgeConverter {
    public static int convertScoreToAge(double score) {
        int index = (int) Math.ceil(score);

        if(index<1 || index>14){
            System.out.println("The score is out of the expected range (1–14). Age cannot be determined.");
        }

        return switch (index) {
            case 1 -> 6;
            case 2 -> 7;
            case 3 -> 8;
            case 4 -> 9;
            case 5 -> 10;
            case 6 -> 11;
            case 7 -> 12;
            case 8 -> 13;
            case 9 -> 14;
            case 10 -> 15;
            case 11 -> 16;
            case 12 -> 17;
            case 13 -> 18;
            case 14 -> 22;
            default -> -1;
        };
    }
}
