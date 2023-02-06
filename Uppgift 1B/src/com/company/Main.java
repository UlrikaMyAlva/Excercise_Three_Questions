package com.company;

import java.util.Scanner;

public class Main {
    /*
    Uppgift 1B

    AUTHOR
    Ulrika Eriksson, 2022-04-13

    INTRODUCTION
    A program that asks three question, and then asks the user to verify if their answers are correct. If not, the
    questions are asked again.

    IMPLEMENTATION
    In a for-loop, the user are asked three question, two that are strings and one that is an int. The strings are
    converted to lower case to make the program not case-sensitive. Depending on what the user is answering the variables
    for the questions are set. The program then prints the answers and asks if they are correct. If not, the i variable
    in the for loop is i--, and it starts over. When the user verifies the answers the program is closed.

    DISCUSSION
    First I tried to use switch-cases, and I wanted to use default if the user did not enter any of the two valid options.
    I did not manage to do this, and I hope I will understand why in the future. The program kept printing de first default
    statement endlessly. I didn't make a loop in the beginning to ask all the questions again, and I decided to start over.
    I used if statements instead. Now when I am done I wonder if While-statement would have been better, so the loop would
    do while the verifying answer is no, and end when the answer is yes. To better this code I would like to use a while-loop,
    and I would like to use switch statements instead, because I think it would make the code easier to read.

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Loop, so the questions are asked again if the user put in anything wrong.
        for (int kassler = 0; kassler < 1; kassler++) {

            //Asks questions and take in answer.
            System.out.println("Are you a woman or a man?");
            String gender = scan.next();
            String lowerGender = gender.toLowerCase();

            //Gender is set depending on answer.
            if (lowerGender.equals("man")) {
                gender = "Man";
            }
            else if (lowerGender.equals("woman")) {
                gender = "Woman";
            }

            System.out.println("Are you a registered customer? (Yes/No)");
            String customer = scan.next();
            String lowerCustomer = customer.toLowerCase();

            if (lowerCustomer.equals("yes")) {
                customer = "Yes";
            }
            else if (lowerCustomer.equals("no")) {
                customer = "No";
            }

            System.out.println("How old are your?");
            int age = scan.nextInt();

            //a string is registered instead of an int, because an int cannot be "0-10" for example.
            String stringAge = null;

            if (age < 10) {
                stringAge = "0 - 10";
            } else if (age > 10 && age < 21) {
                stringAge = "10 - 21";
            } else if (age >= 21) {
                stringAge = "21+";
            }

            //Verifying question
            System.out.println("Is it correct that your gender is: " + gender + ". You are a customer: " + customer + ". Your age is: " + stringAge + ".");
            System.out.println("Yes/No");
            String answer = scan.next();
            String lowerAnswer = answer.toLowerCase();

            //If no, do the loop again. If yes, end the program.
            if (lowerAnswer.equals("yes")) {
                answer = "yes";
                System.out.println("Thank your for using our program!");
            }
            else if (lowerAnswer.equals("no")) {
                answer = "no";
                System.out.println(" ");
                System.out.println("Please retype your answers.");
                System.out.println(" ");
                kassler--;
            }


        }

        System.out.println("Now the loop is ended.");
    }
}

