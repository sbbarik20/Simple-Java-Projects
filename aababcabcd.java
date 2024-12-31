public class aug1305aababcabcd {
    public static void main(String[] args) {
        for(int i = 'A'; i <= 'E'; i++){
            for(char j = 'A'; j <= i; j++){
                System.out.print(String.format("%5s", j));
            }
            System.out.println();
        }
    }
}
