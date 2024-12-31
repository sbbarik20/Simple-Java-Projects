public class aug1307abcde_fghi_jkl {
    public static void main(String[] args) {
        char k = 'A';
        for(int i = 1; i <= 5; i++){
            for(int j = i; j <= 5; j++){
                System.out.print(String.format("%5s", k));
                // System.out.print("  "+k);
                k++;
            }
            System.out.println();
        }
    }
}
