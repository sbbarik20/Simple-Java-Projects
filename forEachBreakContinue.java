public class aug1403forEachBreakContinue {
    public static void main(String[] args) {
        int []arr = new int[] {10,20,30,40,16,23};
        for (int i : arr){
            if(i > 25){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
