public class aug1301floydsNestedLoop {
    public static void main(String[] args) {
        int k = 1;
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
