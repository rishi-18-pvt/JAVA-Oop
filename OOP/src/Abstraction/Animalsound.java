package Abstraction;

abstract class Animal{
    abstract void sound();

}
class lion extends Animal{
    public void sound(){
        System.out.println("roar");
    }
}

class cat extends Animal{
    public void sound(){
        System.out.println("meow");
    }
}

public class Animalsound {
    public static void main(String[] args) {
        Animal Lion = new lion();
        Lion.sound();
        Animal Cat = new cat();
        Cat.sound();
    }
}
