public class aug1306a_bc_def {
    public static void main(String[] args) {
        char k = 'A';
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(String.format("%5s", k));
                // System.out.print("  "+k);
                k++;
            }
            System.out.println();
        }
    }
}
