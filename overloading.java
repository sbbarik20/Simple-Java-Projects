class Shakti{
    int add(int i, int j){
        int r = i + j;
        return r;
    }
    float add(float i, float j){
        float r = i + j;
        System.out.println(r);
    }
}

public class aug2902overloading {
    public static void main(String[] args) {
        Shakti sh = new Shakti();
        int result1 = sh.add(150, 250);
        float result2 = sh.add(25.5f, 15.5f);
        System.out.println(result1);
        System.out.println(result2);
    }
}
