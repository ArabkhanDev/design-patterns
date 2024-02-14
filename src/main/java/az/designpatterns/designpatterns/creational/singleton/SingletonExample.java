package az.designpatterns.designpatterns.creational.singleton;

public class SingletonExample {


    private SingletonExample(){
    }

    private static SingletonExample instance;


    public static SingletonExample getInstance(){
        if(instance == null){
            synchronized (SingletonExample.class){
                if(instance == null){
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

}
