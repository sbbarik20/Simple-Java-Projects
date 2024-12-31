interface A{
    int i = 100;
}
interface B{
    int j = 200;
}
class C implements B, A{
    int k = 300;
}

public class aug2806interface {
    public static void main(String[] args) {
        System.out.println(A.i);       // 100
        System.out.println(B.j);          // 200
        C obj = new C();
        System.out.println(obj.i);     // 100
        
    }
}
