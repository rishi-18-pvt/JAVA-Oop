package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Hamza hamza = new Hamza();
        Rehman rehman = new Rehman();
        Heisenberg heisenberg = new Heisenberg();

        rehman.Say();
        hamza.Say();
        heisenberg.Say();
    }
}

class Hamza{
    public void Say(){
        System.out.println("Ghatak hu isliye ghayal hu");
    }

}

class Rehman extends Hamza{

    public void Say(){
        System.out.println("Salamalikum lyari");
    }
}

class Heisenberg extends Hamza{
    public void Say(){
        System.out.println("Say my name");
    }
}
