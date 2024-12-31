class A{
    int i = 100;
}
class B extends A{
    int j = 200;
}
class C extends B{
    int k = 300;
}

public class aug2804multilevel {
    public static void main(String[] args) {
        C obj = new C();
        System.out.println(obj.i);
        System.out.println(obj.j);
        System.out.println(obj.k);
    }
}
