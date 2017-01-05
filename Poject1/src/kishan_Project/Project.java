package kishan_Project;
import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        
        // variables
        int input, number, counter, number2, userAnswer;
        double right = 0, total = 0;
        
        // makes use of the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Introduction, lets you pick which topic you will do
        System.out.println("Welcome to school of math. \n");
        System.out.println("Please type the number of one of the following options for "
                + "your math quiz:");
        System.out.println("1) Addition with numbers 1-10");
        System.out.println("2) Addition with numbers 1-100");
        System.out.println("3) Subtraction with numbers 1-10");
        System.out.println("4) Subtraction with numbers 1-100");
        System.out.println("5) Multiplication with numbers 1-10");
        System.out.println("6) Exit the program");
        
        // lets you type in a number to pick the topic
        input = keyboard.nextInt();
        
        // while loop to keep checking inputs for questions
        while (input >= -2147483647)
        {
            // checks to see if input is 1
            if (input == 1)
            {
                System.out.println("You have chosen addition with numbers 1-10. \n");
                
                // loop to output 5 random questions
                for (counter = 0; counter < 5; counter ++)
                {
                    
                    // generates 2 random numbers
                    number = (int)(1 + Math.random() * 10);
                    number2 = (int)(1 + Math.random() * 10);
                
                    // generates question
                    System.out.println(number + " + " + number2 + " =");
                    
                    // your answer to the question
                    userAnswer = keyboard.nextInt();
                
                    // if statement to check to see if your answer is wright or wrong
                    if (userAnswer == number + number2)
                    {
                        System.out.println("You are correct! \n");
                        right++;
                        total++;
                    }
                    else
                    {
                        System.out.println("Sorry, that is not correct, the correct answer is "
                                + (number + number2) + "\n");
                        total++;
                    }
                }
                
                // lets you pick another topic
                System.out.println("Please choose one of the following options for "
                     + "your math quiz:");
                System.out.println("1) Addition with numbers 1-10");
                System.out.println("2) Addition with numbers 1-100");
                System.out.println("3) Subtraction with numbers 1-10");
                System.out.println("4) Subtraction with numbers 1-100");
                System.out.println("5) Multiplication with numbers 1-10");
                System.out.println("6) Exit the program");
            }   
        
            // checks to see if input is 2
            else if (input == 2)
            {
                System.out.println("You have chosen addition with numbers 1-100. \n");
                for (counter = 0; counter < 5; counter ++)
                {
                    number = (int)(1 + Math.random() * 100);
                    number2 = (int)(1 + Math.random() * 100);
                
                    System.out.println(number + " + " + number2 + " =");
                    userAnswer = keyboard.nextInt();
                
                    if (userAnswer == number + number2)
                    {
                        System.out.println("You are correct! \n");
                        right++;
                        total++;
                    }
                    else
                    {
                        System.out.println("Sorry, that is not correct, the correct answer is "
                                + (number + number2) + "\n");
                        total++;
                    }
                }
                System.out.println("Please choose one of the following options for "
                    + "your math quiz:");
                System.out.println("1) Addition with numbers 1-10");
                System.out.println("2) Addition with numbers 1-100");
                System.out.println("3) Subtraction with numbers 1-10");
                System.out.println("4) Subtraction with numbers 1-100");
                System.out.println("5) Multiplication with numbers 1-10");
                System.out.println("6) Exit the program");
            }

            // checks to see if input is 3
            else if (input == 3)
            {
                System.out.println("You have chosen Subtraction with numbers 1-10. \n");
                for (counter = 0; counter < 5; counter ++)
                {
                    number = (int)(1 + Math.random() * 10);
                    number2 = (int)(1 + Math.random() * 10);
                
                    System.out.println(number + " - " + number2 + " =");
                    userAnswer = keyboard.nextInt();
                
                    if (userAnswer == number - number2)
                    {
                        System.out.println("You are correct! \n");
                        right++;
                        total++;
                    }
                    else
                    {
                        System.out.println("Sorry, that is not correct, the correct answer is "
                                + (number - number2) + "\n");
                        total++;
                    }
                }
                System.out.println("Please choose one of the following options for "
                    + "your math quiz:");
                System.out.println("1) Addition with numbers 1-10");
                System.out.println("2) Addition with numbers 1-100");
                System.out.println("3) Subtraction with numbers 1-10");
                System.out.println("4) Subtraction with numbers 1-100");
                System.out.println("5) Multiplication with numbers 1-10");
                System.out.println("6) Exit the program");
            }
        
            // checks to see if input is 4
            else if (input == 4)
            {
                System.out.println("You have chosen Subtraction with numbers 1-100. \n");
                for (counter = 0; counter < 5; counter ++)
                {
                    number = (int)(1 + Math.random() * 100);
                    number2 = (int)(1 + Math.random() * 100);
                
                    System.out.println(number + " - " + number2 + " =");
                    userAnswer = keyboard.nextInt();
                
                    if (userAnswer == number - number2)
                    {
                        System.out.println("You are correct! \n");
                        right++;
                        total++;
                    }
                    else
                    {
                        System.out.println("Sorry, that is not correct, the correct answer is "
                                + (number - number2) + "\n");
                        total++;
                    }
                }
                System.out.println("Please choose one of the following options for "
                    + "your math quiz:");
                System.out.println("1) Addition with numbers 1-10");
                System.out.println("2) Addition with numbers 1-100");
                System.out.println("3) Subtraction with numbers 1-10");
                System.out.println("4) Subtraction with numbers 1-100");
                System.out.println("5) Multiplication with numbers 1-10");
                System.out.println("6) Exit the program");
            }
        
            // checks to see if input is 5
            else if (input == 5)
            {
                System.out.println("You have chosen Multiplication with numbers 1-10. \n");
                for (counter = 0; counter < 5; counter ++)
                {
                    number = (int)(1 + Math.random() * 10);
                    number2 = (int)(1 + Math.random() * 10);
                
                    System.out.println(number + " x " + number2 + " =");
                    userAnswer = keyboard.nextInt();
                
                    if (userAnswer == number * number2)
                    {
                        System.out.println("You are correct! \n");
                        right++;
                        total++;
                    }
                    else
                    {
                        System.out.println("Sorry, that is not correct, the correct answer is "
                            + (number * number2) + "\n");
                        total++;
                    }
                }
                System.out.println("Please choose one of the following options for "
                    + "your math quiz:");
                System.out.println("1) Addition with numbers 1-10");
                System.out.println("2) Addition with numbers 1-100");
                System.out.println("3) Subtraction with numbers 1-10");
                System.out.println("4) Subtraction with numbers 1-100");
                System.out.println("5) Multiplication with numbers 1-10");
                System.out.println("6) Exit the program");
            }
            
            // checks to see if input is 6
            else if (input == 6)
            {
                System.out.println("You have chosen to close the program");
                System.out.printf("You tried %.0f problems. \n", total);
                System.out.printf("You answered %.0f problems correctly. \n", right);
                System.out.printf("Your percentage is: %.2f \n", ((right/total) * 100));
                break;
            }
            
            //checks to see if the input is over 6 and if it is it will ask you to pick another choice
            else
            {
                System.out.println("This is not a valid choice, choose again. \n");
                System.out.println("1) Addition with numbers 1-10");
                System.out.println("2) Addition with numbers 1-100");
                System.out.println("3) Subtraction with numbers 1-10");
                System.out.println("4) Subtraction with numbers 1-100");
                System.out.println("5) Multiplication with numbers 1-10");
                System.out.println("6) Exit the program \n");
            }
            
            // lets you pick another topic
            input = keyboard.nextInt();
        }
    }
}
