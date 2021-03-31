import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList();
        list.add("Vova");
        list.add("Ivan");
        list.add("Vasya");
        System.out.println("Pered");
        System.out.println(list);
        System.out.println("Posle");
        Collections.sort(list);
        System.out.println(list);

    }
}
