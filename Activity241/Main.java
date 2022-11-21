package Activity241;

import java.util.Scanner;

import javafx.beans.binding.MapExpression;

public class Main {

    public static void main(String[] args)
  {
    String student = getInput();
    // Display the end result before program termination
    System.out.println("The student you chose was: " + student);
  }
  
  /**
   * Determine whether a given String can be parsed as an integer.
   * @param str a String with unknown contents
   * @return true if str can be parsed as an integer, false otherwise.
   */
  public static boolean isInteger(String str) 
  {
    // null references are not integers.
    if (str == null) 
    {
        return false;
    }
    
    // an intermediary variable storing the length of str
    // because we will be reusing that value.
    int length = str.length();
    
    // empty strings cannot be parsed as integers
    if (length == 0) 
    {
        return false;
    }
    
    // this will count the current position in str
    // begins at index 0
    int i = 0;
    
    // Check for a negative symbol at the beginning of str
    if (str.substring(0, 1).equals("-")) 
    {
        // a String that contains just the negative symbol is not an int.
        if (length == 1) 
        {
            return false;
        }
        // advance to the first potential digit given a leading negative symbol
        i = 1;
    }
    
    // This loop will terminate if i becomes equal to or greater than length
    while (i < length)
    {
      // characterAtIndex stores the single element substring at position i within str
      String characterAtIndex = str.substring(i, i+1);
      // if any character in str (after a potential leading negative symbol)
      // precedes 0 or exceeds 9, it will be a letter or symbol that cannot
      // represent a digit. These letters or symbols will lead to an str value
      // that cannot be parsed as an int.
      if (characterAtIndex.compareTo("0") < 0 || 
        characterAtIndex.compareTo("9") > 0)
      {
        return false;
      }
      // incrementing the value of i each iteration by one ensures
      // that the loop will terminate when i == length
      i += 1;
    }
    // Having made it past all the conditions that could possibly lead
    // to a value of str that could not be parsed as an int, 
    return true;
  }
  
  /**
   * Uses a String containing the students in your class sorted alphabetically and 
   * separated by spaces to retreive the student represented by studentNumber
   * 
   * @param studentNumber Precondition: studentNumber is an int between 1 and 4 inclusive
   * @return the student name corresponding to studentNumber
   */
  public static String getStudent(int studentNumber)
  {
    String students = "Maine Rebecca Lucy David";
    int numberOfSpaces = 0;
    String studentBuilder = students;

    while (numberOfSpaces < studentNumber - 1){
        studentBuilder = studentBuilder.substring(studentBuilder.indexOf(" ") + 1);
        numberOfSpaces += 1;
    }

    if (studentBuilder.indexOf(" ") == -1){
        return studentBuilder;
    }

    studentBuilder = studentBuilder.substring(0, studentBuilder.indexOf(" "));

    return studentBuilder;
  }
  
  /**
   * Collects user input and calls helper methods to process it.
   * @return
   */
  public static String getInput()
  {
    // Instantiate a Scanner using the standard input (terminal/command line)
    Scanner sc = new Scanner(System.in);
    // Prompt the user for input
    System.out.println("Enter an integer between 1 and 4 inclusive: ");
    // The next line typed by a user (terminiating with the enter/return key) is stored as input.
    String input = sc.nextLine();
    
    // The termination condition for this loop is user input that can be parsed as an integer
    // with value between 1 and 4 inclusive.
    while (!isInteger(input) || Integer.parseInt(input) > 4 || Integer.parseInt(input) < 1)
    {
      // re-prompt the user ot provide the specified kind of input.
      System.out.println("Please enter an integer between 1 and 4 inclusive: ");
      // Store a new value for input.
      input = sc.nextLine();
    }
    // Display the user's input
    System.out.println("Your integer was: " + input);
    // returns the value produced by the getStudent method, as determined by the parameter
    // resulting from parsing the user's String input as an Integer.  
    return getStudent(Integer.parseInt(input));
  }



    

    // public static void main(String[] args){ 
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter the dividend: ");
    //     int dividend = sc.nextInt();
    //     System.out.println("Enter the divisor: ");
    //     int divisor = sc.nextInt();

    //     while (divisor <= dividend){
    //         dividend -= divisor;
    //     }
        
    //     if (dividend == 0){
    //         System.out.println("Evenly Divisible");
    //     } else {
    //         System.out.println("Not Evenly Divisible");
    //     }
    // }


    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter  integer: ");
    //     int integer = sc.nextInt();
        
    //     while (integer > 0){
    //         int remainder = integer % 10;
    //         System.out.println(remainder);
    //         integer = integer / 10;
    //     }
    // }
    

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter an integer: ");
    //     int number = sc.nextInt();

    //     int count = 0;
    //     while (number > 0){
    //         if ((number % 10 == 0)){
    //             number = number / 10;
    //             if ((number % 10 == 1)){
    //                 count += 1;
    //                 number = number / 10;
    //             } else {
    //                 number = number / 10;
    //             }
    //         } else {
    //             number = number / 10;
    //         }
    //     }
    //     System.out.println(count);
    // }


    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("How many numbers would you like to enter?: ");
    //     int numberOfNumbers = sc.nextInt();

    //     System.out.println("Enter numbers: ");
    //     int number = sc.nextInt();

    //     int min = 10;
    //     int max = -10;
    //     int next = number % 10;

    //     while (numberOfNumbers > 0){
    //         if (next < min){
    //             min = next;
    //             number = number / 10;
    //             next = number % 10;
    //         } else if (next > max){
    //             max = next;
    //             number = number / 10;
    //             next = number % 10;
    //         }
    //         numberOfNumbers -= 1;
    //     }
    //     System.out.println("Min: " + min + ", Max:" + max);
    // }

}
