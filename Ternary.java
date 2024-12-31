public class aug0901Ternary {
    public static void main(String[] args) {     
    System.out.println("Enter a number : ");
    int  num = new java.util.Scanner(System.in).nextInt();
    String output = num % 2 == 0 ? "Even number !" : "Odd number !" ;
    System.out.println(output);   
    }
}
