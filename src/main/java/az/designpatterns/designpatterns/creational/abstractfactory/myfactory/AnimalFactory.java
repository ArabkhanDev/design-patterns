package az.designpatterns.designpatterns.creational.abstractfactory.myfactory;

import az.designpatterns.designpatterns.creational.abstractfactory.Animal;
import az.designpatterns.designpatterns.creational.abstractfactory.myabstractfactory.AnimalAbstractFactory;

public class AnimalFactory {

    public static Animal getAnimal(AnimalAbstractFactory factory){
        return factory.createAnimal();
    }

}
