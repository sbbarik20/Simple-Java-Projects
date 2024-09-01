
public class aug1313armstrongCheck {
    public static void main(String [] args) {
        System.out.println("Enter a number : ");
        int num = new java.util.Scanner(System.in).nextInt();
        int number = num, count = 0, sum = 0;
        while(num != 0){
            count++;
            num = num / 10;
        }

        num = number;

        while(num != 0){
            int rem = num % 10;
            // sum = sum + Math.pow(rem, rem);
            sum += Math.pow(rem, count);
            num = num / 10;
        }

        if(number == sum){
            System.out.println(number + " is an Amstrong number !");
        }
        else{
            System.out.println(number + " is Not an amstrong number !");
        }
    }
}





;
















// public class aug1313armstrongCheck {
//     public static void main(String [] args) {
//         int num = 153;
//         int number = num;
//         int nomb = number;
//         int count = 0;
//         int sum = 1;
//         int rem;

//         while(num != 0){
//             num = num / 10;
//             count++;
//         }

//         // while (number != 0) {
//         //     rem = number % 10;
//         //     sum = sum + Math.pow(rem, count);
//         //     number = number / 10;
//         // }

//         while (count != 0){
//             rem = number % 10;
//             sum = (rem , rem);
//             // number = number / 10;
//             count--;
//         }
//         System.out.println(sum);

//         if(nomb == sum){
//             System.out.println("Amstrong number !");
//         }
//         else{
//             System.out.println("Not one !");
//         }
//     }
// }






