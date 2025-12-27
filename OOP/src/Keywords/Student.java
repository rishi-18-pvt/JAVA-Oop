package Keywords;

public class Student {
    String name;
    int Age;

    Student (String name, int Age){
        this.name = name;
        this.Age = Age;
    }
    void DisplayInfo(){
        System.out.println(name+" is "+ Age + " old " );
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rishi", 20);
        s1.DisplayInfo();

    }
}
