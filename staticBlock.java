class A{
    void show(){
        System.out.println("hello !");
    }
}

public class aug2203staticBlock {
    static{
        System.out.println("static block !");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}
