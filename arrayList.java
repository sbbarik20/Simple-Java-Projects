import java.util.ArrayList;
import java.util.Iterator;

public class oct0203arrayList {
    public static void main(String[] args) {
        ArrayList <Integer> li = new ArrayList<Integer>();
        li.add(10);
        li.add(20);
        li.add(30);

        Iterator <Integer> i = li.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }                                                                                             
    }
}
