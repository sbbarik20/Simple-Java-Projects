
public class aug1312first10Sum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter number of natural no : ");
        int num = new java.util.Scanner(System.in).nextInt();
        for(int i = 1; i <= num; i++){
            sum = sum + i;
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println(sum);
    }
}







/*
public class aug1312first10Sum {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("sum of first " + n + "natural numbers : " + sum);
    }
}
    */