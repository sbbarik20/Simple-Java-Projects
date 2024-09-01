public class aug1310first10Prime {
    public static void main(String[] args) {
        int num = 2;
        int countDown = 1;
        while (countDown <= 10) {
            int count = 0;
            for(int i = 2; i <= num-1; i++){
                if(num % i == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.print(num + " ");
                countDown++;
            }
            num++;
        }
    }
}











/*
public class aug1310first10Prime {
    public static void main(String[] args) {
        int n =10;
        System.out.println("Prime number series : ");
        for(int i = 2; i <= n; i++){
            boolean isPrime = true;
            for(int j = 2; j * j <=i; j++){
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i + " ");
            }
        }
    }
}
*/