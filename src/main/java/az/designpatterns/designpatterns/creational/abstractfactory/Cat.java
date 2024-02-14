package az.designpatterns.designpatterns.creational.abstractfactory;

public class Cat implements Animal {


    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void move() {
        System.out.println("Cat is moving");
    }


    @Override
    public String toString(){
        return "Cat is found";
    }
}
