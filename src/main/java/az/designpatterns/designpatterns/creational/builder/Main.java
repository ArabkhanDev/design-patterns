package az.designpatterns.designpatterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .setType("small")
                .setHeight("10")
                .setRoom(2)
                .setBuildingHouse(false)
                .build();

        System.out.println(house);
    }

}
