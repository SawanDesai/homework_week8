package programme3;
// Write a Java program that takes the user to provide a single character from the
  //      alphabet. Print Vowel of Consonant, depending on the user input. If the user input
    //    Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
      //  error message.
        //For eg:
        //Input an alphabet: p
        //Expected Output:
        //Input letter is Consonant

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner Three = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String alp = Three.next().toLowerCase();

        boolean uppercase = alp.charAt(0)>=65 && alp.charAt(0)<=90;
        boolean lowercase = alp.charAt(0)>=97 && alp.charAt(0)<=122;
        boolean vowels = alp.equals("a") || alp.equals("e") || alp.equals("i") || alp.equals("o") || alp.equals("u");

        if (alp.length() >1)
        {
            System.out.println("Error - Not a single character");
        }
        else if (!(uppercase ||lowercase))
        {
            System.out.println("Error - Not a letter, Enter uppercase or lowercase letter");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }

    }

    }

