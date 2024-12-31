interface Agenda1{
    void task1();
}
interface Agenda2{
    void task2();
}

class meeting implements Agenda1, Agenda2{
    public void task1(){
        System.out.println("task1 done ");
    }
    public void task2(){
        System.out.println("task2 done ");
    }
}

public class aug3105interface {
    public static void main(String[] args) {
        meeting obj = new meeting();
        obj.task1();
        obj.task2();
    }
}
