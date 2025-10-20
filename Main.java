import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here

    // write a loop that prints the number between 3 and 25 

    int count = 3; 
    while (count <= 25) 
    {
      System.out.println(count);
      count += 2; 
    }

    // Problem 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter positive numbers to add. Enter -1 to stop"); 
    int sum = 0; 
    int userInput = 0; 

    while (userInput != -1)
    {
      userInput = sc.nextInt();
      sum += userInput;
    }
    sum++; // note that when the user enters -1, we add -1 to the sum 
           // so we ++ to add back the 1 
    System.out.println("The sum is " + sum);

    // Problem 2 
    int N; 
    System.out.println("How many numbers do you want to enter?"); 
    N = sc.nextInt();
    int max = Integer.MIN_VALUE; 

    int counter = 0;
    while (counter < N)
    {
      userInput = sc.nextInt();
      if (userInput > max)
      {
        max = userInput; 
      }
      counter++; 
    }
    System.out.println("The largest score is " + max);

    // Problem 3 
    String word = "calculator"; 
    int index = 0; 
    int counters = 0; 
    while (index < word.length()); // get every letter loop 
    {
      counters++;
      if (counters == 3)
      {
        counters = 0; 
      }
      else 
      {
      String currentLetter = word.substring(index, index+1); 
      }
      index++; 
    }


  }
}
