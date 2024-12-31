public class aug1701crudOperation {
    int empid = 5;
    public static void main(String[] args) {
        aug1701 a1 = new aug1701();
        System.out.println(a1.empid);              // Read
        a1.empid = 44;                    // Update
        System.out.println(a1.empid);              //Read
    }
}
