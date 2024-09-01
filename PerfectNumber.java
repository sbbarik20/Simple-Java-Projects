import java.util.Scanner;

class Imort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n, sum = 0;
        System.out.println("Enter the number: ");
        n = s.nextLong();
        int i = 1;
        while (i <= n / 2) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
            if (sum == n) {
                System.out.println("Perfect number");
            } else {
                System.out.println("Not one");
            }
        }
    }
}
