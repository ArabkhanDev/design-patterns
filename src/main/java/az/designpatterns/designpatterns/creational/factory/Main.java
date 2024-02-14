package az.designpatterns.designpatterns.creational.factory;

public class Main {

    public static void main(String[] args) {

        Animal cat = AnimalFactory.getAnimal("Cat");
        Animal dog = AnimalFactory.getAnimal("Dog");
        Animal snake = AnimalFactory.getAnimal("Snake");


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(snake);

    }

}
