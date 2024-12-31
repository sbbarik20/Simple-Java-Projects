public class aug1201alphabet {
    public static void main(String[] args) {
        System.out.println("Enter the Character : ");
        char ch = new java.util.Scanner(System.in).next().charAt(0);
        if((ch >= 'a' && ch <= 'z' ) || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + " is an alphabet !");
        }
        else{
            System.out.println(ch + " is not an alphabet !");
        }
    }
}