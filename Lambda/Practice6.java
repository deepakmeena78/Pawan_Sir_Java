public class Practice6 {

    // A static method that converts a string to uppercase and prints it
    public static void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void main(String[] args) {
        // Using a method reference
        StringProcessor processor = Practice6::printUpperCase;

        // Calling the process method
        processor.process("hello");
    }}

constructor reference

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
//b