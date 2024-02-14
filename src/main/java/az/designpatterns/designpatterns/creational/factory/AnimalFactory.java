package az.designpatterns.designpatterns.creational.factory;

public class AnimalFactory {

    public static Animal getAnimal(String type){
        if("Cat".equalsIgnoreCase(type)){
            return new Cat();
        } else if ("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        }
        return null;
    }

}
