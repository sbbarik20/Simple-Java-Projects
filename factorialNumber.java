public class aug1005factorial {
    public static void main(String []args) {
        System.out.println("Enter a number : ");
        int num = new java.util.Scanner(System.in).nextInt();
        int f = 1;
        for(int i = 1 ; i <= num; i++){
            f = f * i;
        }
        System.out.println(f);
    }
}
