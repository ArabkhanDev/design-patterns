package az.designpatterns.designpatterns.creational.factory;

public class Dog implements Animal{


    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving");
    }

    @Override
    public String toString(){
        return "Dog is found";
    }
}
