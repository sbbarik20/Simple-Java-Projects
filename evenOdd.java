public class aug0705evenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        int num = new java.util.Scanner(System.in).nextInt();
        if(num % 2 == 0){
            System.out.println("Number is Even !");
        }
        else{
            System.out.println("Number is Odd !");
        }
    }
}
