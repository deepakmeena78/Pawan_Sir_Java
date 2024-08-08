import java.util.*;

public class TreeSet1 {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();
        TreeSet ts1 = new TreeSet<>();
        ts.add(40);
        ts.add(30);
        ts.add(90);
        ts.add(5);
        ts.add(30);
        ts.add(7);
        System.out.println(ts);

        ts1.add("Ankit");
        ts1.add("Ankit");
        ts1.add("Tanmay");
        ts1.add("Mohan");
        ts1.add("Kapil");
        ts1.add("Sohan");
        System.out.println(ts1);

    }
}