//Project - Guess Game
//      Write a program that generates a random number and asks the user to guess what the number is.
//      If the user's guess is higher than the random number, the program should display "Too high, try again."
//      If the user's guess is lower than the random number, the program should display "Too low, try again."
//      The program should use a loop that repeats until the user correctly guesses the random number.
package foundation;

import java.util.Scanner;

public class program_46 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int target= (int)(Math.random()*1000);

        do {
            System.out.println("guess the number");
            int in = sc.nextInt();

            if (in == target) {
                System.out.println("congrats you guessed it right");
                break;
            }
            if (in > target)
                System.out.println("number is too high");
            else
                System.out.println("number is too low");
        }while(true);

        }
    }

