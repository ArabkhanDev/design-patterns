package az.designpatterns.designpatterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        SingletonExample singletonExample1 = SingletonExample.getInstance();


        System.out.println(singletonExample); //SingletonExample@76ed5228
        System.out.println(singletonExample1); //SingletonExample@76ed5228
    }

}
