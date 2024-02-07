class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog {
    void play() {
        System.out.println("Labrador is playing");
    }
}

class Cat extends Animal{
    void meow() {
        System.out.println("Cat is meowing");
    }
}
public class Main{
    public static void main(String[] args) {
    Labrador obj= new Labrador();
    obj.eat();
    obj.bark();
    obj.play();
    Cat obj1= new Cat();
    obj1.meow();/*  */
  }
}
