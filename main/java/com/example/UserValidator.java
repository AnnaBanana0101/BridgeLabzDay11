package com.example;

import java.util.Scanner;
import java.util.regex.*;

public class UserValidator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name:");

        String first_name = sc.nextLine();
        String valid_first_name = "^[A-Z][a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(valid_first_name);
        Matcher matcher = pattern.matcher(first_name);

        System.out.println("Valid First Name: " + matcher.matches());
        

    }
}