public class aug1315primeNumCheck {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        int num = new java.util.Scanner(System.in).nextInt();
        int count = 0;
        for(int i = 2; i <= num-1; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count >= 1){
            System.out.println(num + " is not a Prime number");
        }
        else{
            System.out.println(num + " is a Prime number");
        }
    }
}
