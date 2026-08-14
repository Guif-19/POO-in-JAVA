package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // try{}, catach{}, finally{}

        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Say a number: ");
            int number = input.nextInt();

        }
        catch(InputMismatchException e){
            System.out.println("Please enter a number");
        }
        catch(ArithmeticException e){
            System.out.println("U cant divide by 0");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            input.close();
            System.out.println("this always executes");
        }
    }
}
