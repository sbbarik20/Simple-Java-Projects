public class aug1314upto10ArmstrongNum {
    public static void main(String[] args) {
        int count = 1;
        int num = 1;
        System.out.println("First 10 Armstrong number :");
        while (count <= 10) {
            int number = num;
            int nomb = num;
            int sum = 0;
            int numberofDigits = String.format("%d", num).length();
            while (nomb != 0) {
                int rem = nomb % 10;
                sum += Math.pow(rem, numberofDigits);
                nomb /= 10;
            }
            if(num == sum){
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}














/*
public class aug1314upto10ArmstrongNum {
    public static void main(String[] args) {
        int n = 10000000;
        System.out.println("Amstrong number series :");
        for(int i = 0; i <= n; i++){
            int num = i;
            int sum = 0;
            while(num > 0){
                int rem = num % 10;
                sum += rem * rem * rem;
                num /= 10;
            }
            if(sum == i){
                System.out.println(i + " ");
            }
        }
    }
}
 */













