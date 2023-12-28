package com.example;

import java.util.Scanner;
import java.util.regex.*;

public class UserValidator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //First name
        System.out.println("Enter the first name:");

        String first_name = sc.nextLine();
        String valid_first_name = "^[A-Z][a-zA-Z]{2,}$";

        // Pattern pattern = Pattern.compile(valid_first_name);
        // Matcher matcher = pattern.matcher(first_name);
        boolean valid = patternValidator(first_name, valid_first_name);
        System.out.println("Valid First Name: " + valid);
        System.out.println("");
        if (!valid) 
            return;

        //Last name
        System.out.println("Enter the last name:");

        String last_name = sc.nextLine();
        String valid_last_name = "^[A-Z][a-zA-Z]{2,}$";
        valid = patternValidator(last_name, valid_last_name);
        System.out.println("Valid Last Name: " + patternValidator(last_name, valid_last_name));
        if(!valid)
            return;

        
    }

    public static boolean patternValidator(String text, String valid_text)
    {
        Pattern pattern = Pattern.compile(valid_text);
        Matcher matcher = pattern.matcher(text);

        return matcher.matches();
    }
}