package com.company.Question_1;

import java.util.ArrayList;
import java.util.List;

public class addToArrayList {
    List<String> numbers = new ArrayList<>();

    private void arraylist() {
        numbers.add(0, "cow");
        numbers.add(1, "chicken");
        numbers.add(2, "pig");


    }

    private void displayArray() {
        for (String numbers : numbers) {
            System.out.println(numbers.length());
        }
    }


}

