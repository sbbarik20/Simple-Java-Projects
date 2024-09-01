public class aug0706leapyear {
    public static void main(String []args) {
        System.out.println("Enter year : ");
        int year = new java.util.Scanner(System.in).nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(String.format("%s is a leap year !",year));
        }
        else{
            System.out.println("Not one !");
        }
    }
}
