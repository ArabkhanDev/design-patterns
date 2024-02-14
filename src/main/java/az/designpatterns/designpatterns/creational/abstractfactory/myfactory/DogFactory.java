package az.designpatterns.designpatterns.creational.abstractfactory.myfactory;

import az.designpatterns.designpatterns.creational.abstractfactory.Animal;
import az.designpatterns.designpatterns.creational.abstractfactory.Dog;
import az.designpatterns.designpatterns.creational.abstractfactory.myabstractfactory.AnimalAbstractFactory;

public class DogFactory implements AnimalAbstractFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
