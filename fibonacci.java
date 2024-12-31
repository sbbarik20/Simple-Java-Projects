public class aug1309fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        int n = new java.util.Scanner(System.in).nextInt();
        int num1 = 0, num2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
