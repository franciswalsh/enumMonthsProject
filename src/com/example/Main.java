package com.example;
import com.example.common.Month;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose from the following months: ");
        List<String> monthsToChoose = new ArrayList<>();
        List<String> monthsRemaining = new ArrayList<>();
        for (Month month : Month.values()){
            monthsToChoose.add(month.getEnglishName());
        }
        System.out.println(monthsToChoose);
        String userMonth = scanner.nextLine();

        int monthIndex = Month.valueOf(userMonth.toUpperCase()).ordinal();

        for (int i = monthIndex; i < monthsToChoose.size(); i++){
            monthsRemaining.add(monthsToChoose.get(i));
        }

        System.out.println("These are the months remaining in the year: ");
        System.out.println(monthsRemaining);
    }
}
