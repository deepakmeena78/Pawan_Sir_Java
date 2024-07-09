import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface {
    public void getPiValue();
}
class A{
    public void getPiValue(){
        System.out.println("");
    }
}

public class Practice1 {

    public static void main(String[] args) {

        
        MyInterface obj;

       
        obj = () -> 3.1415;

        System.out.println("Value of Pi = " + obj.getPiValue());
    }
}