class Employee{
    int empid;
    Employee(int empid){
        this.empid = empid;
    }
    Employee(Employee e){
        this.empid = e.empid;
    }
}

public class aug2404copyConstructor {
    public static void main(String[] args) {
        Employee e1 = new Employee(200);
        System.out.println(e1.empid);
        
        Employee e2 = new Employee(e1.empid)
        System.out.println(e2.empid);
    }
}
