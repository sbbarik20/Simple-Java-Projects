public class aug1001switchCase {
    public static void main(String[] args) {
        System.out.println("Enter day : ");
        String day = new java.util.Scanner(System.in).next();
        switch (day) {
            case "monday":
                System.out.println("1st day");
                break;
            case "tuesday":
                System.out.println("2nd day");
                break;
            case "wednesday":
                System.out.println("3rd day");
                break;
            case "thursday":
                System.out.println("4th day");
                break;
            case "friday":
                System.out.println("5th  day");
                break;
            case "saturday":
                System.out.println("6th day");
                break;
            case "sunday":
                System.out.println("7th day");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
    
}
