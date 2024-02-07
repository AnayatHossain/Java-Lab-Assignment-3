class Grandparent {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Parent class inheriting from Animal
class Dog extends Grandparent {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class inheriting from Dog
class Labrador extends Dog {
    void play() {
        System.out.println("Labrador is playing");
    }
}
public class Main{
    public static void main(String[] args) {
    Labrador obj= new Labrador();
    obj.eat();
    obj.bark();
    obj.play();
  }
}