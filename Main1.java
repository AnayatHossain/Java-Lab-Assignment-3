
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
public class Main{
    public static void main(String[] args) {
    Dog obj= new Dog();
    obj.eat();
    obj.bark();
  }
}