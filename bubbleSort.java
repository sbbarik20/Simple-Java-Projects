public class sep0303bubbleSort {
    public static void main(String[] args) {
        int arr[] = new int[]{25,17,31,13,2,54,96};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After Bubble sort elements are : ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
