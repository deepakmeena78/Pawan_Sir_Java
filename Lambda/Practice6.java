public class Practice6 {
    public static void main(String[] args) {

    }

    public static void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }


    }


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}