public class aug1311first10EvenSum {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for(int i = 2; i <= n * 2; i += 2){
            sum += i;
        }
        System.out.println("Sum of the first " + n + " even numbers : " + sum);
    }
}







/*

public class aug1311first10EvenSum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter number of even no : ");
        int num = new java.util.Scanner(System.in).nextInt();
        for(int i = 1; i <= num * 2; i++){
            if(i%2 == 0){
                sum = sum + i;
                System.out.print(i+" ");
            }
        }
        System.out.println("\n");
        System.out.println(sum);
    }
}

 */