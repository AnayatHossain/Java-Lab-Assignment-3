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
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}
public class Main{
    public static void main(String[] args) {
    Dog obj= new Dog();
    Cat obj1= new Cat();
    obj.eat();
    obj.bark();

    obj.eat();
    obj1.meow();
    
  }
}