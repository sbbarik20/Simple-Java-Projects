public class aug1302diamond {
    public static void main(String[] args) {
        System.out.println("Enter no of line : ");
        int line  = new java.util.Scanner(System.in).nextInt();
        int space = line / 2;
        int star = 1;
        for(int ln = 0; ln < line; ln++){
            for(int sp = 0; sp < space; sp++){
                System.out.print(" ");
            }
            for(int st = 0; st < star; st++){
                System.out.print("*");
            }
            if(ln < (line / 2)){
                space = space - 1;
                star = star + 2;
            }
            else{
                space = space + 1;
                star = star - 2;
            }
            System.out.println();
        }
    }
}
