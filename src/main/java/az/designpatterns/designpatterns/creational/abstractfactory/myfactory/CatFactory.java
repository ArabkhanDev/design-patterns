package az.designpatterns.designpatterns.creational.abstractfactory.myfactory;

import az.designpatterns.designpatterns.creational.abstractfactory.Animal;
import az.designpatterns.designpatterns.creational.abstractfactory.Cat;
import az.designpatterns.designpatterns.creational.abstractfactory.myabstractfactory.AnimalAbstractFactory;


public class CatFactory implements AnimalAbstractFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
