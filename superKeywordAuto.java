class A{
    A(){
        System.out.println("super class constructor ");
    }
}
class B extends A{
    B(){
        System.out.println("child class constructor");
    }
}

public class aug2807superKeywordAuto {
    public static void main(String[] args) {
        B obj = new B();
    }
}
