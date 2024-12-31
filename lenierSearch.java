public class aug0203lenierSearch {
    public static void main(String[] args) {
        int arr[] = new int[]{20,30,50,60,40};
        int search = 60;
        int flag = 0;
        int i;

        System.out.println("Array elements are : ");

        for(i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        for(i = 0; i < arr.length; i++){
            if(arr[i] == search){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("search found at index " + i);
        }
        else{
            System.out.println("not found");
        }
    }
}
