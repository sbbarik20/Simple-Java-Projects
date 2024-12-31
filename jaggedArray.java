import java.util.*;

public class sep0901jaggedArray{
    public static void main(String[] args) {
        int arr[][] = new int [3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 no of element : ");
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println("elements are : ");
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println("");
        }
    }
}
