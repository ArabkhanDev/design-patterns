package az.designpatterns.designpatterns.creational.abstractfactory;


import az.designpatterns.designpatterns.creational.abstractfactory.myabstractfactory.AnimalAbstractFactory;
import az.designpatterns.designpatterns.creational.abstractfactory.myfactory.AnimalFactory;
import az.designpatterns.designpatterns.creational.abstractfactory.myfactory.CatFactory;
import az.designpatterns.designpatterns.creational.abstractfactory.myfactory.DogFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println(AnimalFactory.getAnimal(new CatFactory()));
        System.out.println(AnimalFactory.getAnimal(new DogFactory()));

        System.out.println(AnimalFactory.getAnimal(new AnimalAbstractFactory() {
            @Override
            public Animal createAnimal() {
                return null;
            }
        }));
    }

}
