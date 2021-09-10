import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0, sumInt = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0,sumDub = 0.0;

    //Start of Integer area.

    System.out.println("Enter your first integer number you would like to add. ");
    num1 = keyboard.nextInt();

    System.out.println("Enter your second integer number you would like to add. ");
    num2 = keyboard.nextInt();

    System.out.println("Enter your third integer number you would like to add. ");
    num3 = keyboard.nextInt();

    //Start of doubles area.

    System.out.println("Please enter your first double number you would like to add.");
    dub1 = keyboard.nextDouble();

    System.out.println("Please enter your second double number you would like to add.");
    dub2 = keyboard.nextDouble();

    System.out.println("Please enter your third double number you would like to add.");
    dub3 = keyboard.nextDouble();

    //Outputs for integers
    sumInt = num1 + num2 + num3;
    System.out.println("The sum of "+num1+" "+num2+" "+num3+" = "+ sumInt);

    //Output for doubles
    sumDub = dub1 + dub2 + dub3;
    System.out.println("The sum of "+dub1+" "+dub2+" "+dub3+" = "+ sumDub);

    //TODO prompt the user to get input for all of the above int variables.

    //TODO prompt the user to get input for all of the above double variables.

    //TODO print the three ints and their sum.

    //TODO print the three doubles and their sum.

  }
}
