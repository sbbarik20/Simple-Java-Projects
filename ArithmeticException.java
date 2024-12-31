public class sep1602ArithmeticException {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        int num = new java.util.Scanner(System.in).nextInt();
        System.out.println(num / 0);
    }
}
