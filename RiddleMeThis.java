import java.util.Scanner;

public class RiddleMeThis {

     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int sum = 0;
          String first, second, third, fourth, fifth;

          System.out.println("WELCOME TO THE RIDDLE SHOW!!!!!");
          System.out.println("-------------------------------");
          System.out.println("RULE 1: Answer the riddles without determiners. Example (nose, phone, etc.)");
          System.out.println("RULE 2: Your answers can be in either small letters or capital letters.");
          System.out.println("-------------------------------------------------------------------------");

          System.out.println();

          System.out.println("Riddle No.1:");
          System.out.println("I can be cracked, made, told, and played. What am I?");
          first = input.nextLine();

          if(first.equalsIgnoreCase("joke")) {
                 sum = sum + 1;
          }

         System.out.println();

         System.out.println("Riddle No.2:");
         System.out.println("The more you take away, the larger I become. What am I?");
         second = input.nextLine();

         if(second.equalsIgnoreCase("hole")) {
             sum = sum + 1;
         }

         System.out.println();

         System.out.println("Riddle No.3:");
         System.out.println("What has a head, a tail, is brown, and has no legs?");
         third = input.nextLine();

         if(third.equalsIgnoreCase("penny")) {
             sum = sum + 1;
         }

         System.out.println();

         System.out.println("Riddle No.4:");
         System.out.println("I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");
         fourth = input.nextLine();

         if(fourth.equalsIgnoreCase("echo")) {
             sum = sum + 1;
         }

         System.out.println();

         System.out.println("Riddle No.5:");
         System.out.println("I can run, but not walk. Wherever I go, thought follows close behind. What am I?");
         fifth = input.nextLine();

         if(fifth.equalsIgnoreCase("nose")) {
             sum = sum + 1;
         }


         System.out.println();

         System.out.println("Your score is: " + sum + "/5");

         System.out.println();

         System.out.println("THANKS FOR PLAYING.....");

     }
}

