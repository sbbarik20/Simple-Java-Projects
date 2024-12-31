// public class aug1304halfDiamond {
//     public static void main(String[] args) {
//         int line = 9;
//         int space = line / 2;
//         int star = 1;
        
//     }
// }





public class aug1304halfDiamond {
    public static void main(String[] args) {
        int line = 5;
        int space = line / 2;
        int star = 1;
        for(int ln = 0; ln < (line/2)+1; ln++){
            for(int sp = 0; sp < space; sp++){
                System.out.print("");
            }
            for(int st = 0; st < star; st++){
                System.out.print("*");
            }
            if(ln < (line / 2)){
                space = space - 1;
                star = star + 1;
            }
            System.out.println();
        }
    }
}
