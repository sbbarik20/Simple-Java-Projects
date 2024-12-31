import java.util.InputMismatchException;
import java.util.Scanner;

public class sep1701exceptionHandeling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        try{
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println("Sum : " + (i+j) + " Div : " + (i/j));
        }
        catch(ArithmeticException f){
            System.out.println(f.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("plz enter a number not String");
        }
        System.out.println("other tasks ...");
    }
}

