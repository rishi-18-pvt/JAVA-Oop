package Keywords;

public class Person {
    String name = "Parent";
}

class  Student1 extends Person{
    String name= "Child";
    void Print(){
        System.out.println(name);
        System.out.println(super.name);
    }


    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.Print();
    }
}
