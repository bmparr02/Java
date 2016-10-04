
package cecs_a3_p3;

import java.util.Scanner;

public class Vowel {

   
    public static void main(String[] args) 
    {
        String input;
        char letter;
        int as = 0;
        int es = 0;
        int is = 0;
        int os = 0;
        int us = 0;
        int nonVowels = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        input = scan.next();
        
        for (int check = 0; check < input.length(); check++)
        {   
            letter = input.charAt(check);
            
            switch(letter)
            {
                case 'a':
                    as++;
                    break;
                case 'e':
                    es++;
                    break;
                case 'i':
                    is++;
                    break;
                case 'o':
                    os++;
                    break;
                case 'u':
                    us++;
                    break;
                case 'A':
                    break;
                case 'E':
                    break;
                case 'I':
                    break;
                case 'O':
                    break;
                case 'U':
                    break;
                default:
                    nonVowels++;
            }
        }          
         System.out.println("::Character Count::");
         System.out.println("a's: " + as);
         System.out.println("e's: " + es);
         System.out.println("i's: " + is);
         System.out.println("o's: " + os);
         System.out.println("u's: " + us);
         System.out.println("Non-vowel letters: " + nonVowels);
    }
    
}
