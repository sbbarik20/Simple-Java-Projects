public class aug1401between1_10number {
    public static void main(String[] args) {
        java.util.Scanner obj = new java.util.Scanner(System.in);
        System.out.println("Enter a number between 1 and 10 :");
        int n = obj.nextInt();
        while (n > 10 || n < 1) {
            System.out.println("Enter no between 1 and 10");
            n = obj.nextInt();
        }
        System.out.println("Thanks for the number !");
    }
}
