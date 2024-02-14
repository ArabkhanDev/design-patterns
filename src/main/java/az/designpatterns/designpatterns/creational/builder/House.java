package az.designpatterns.designpatterns.creational.builder;

public class House {

    private final String type;
    private final String height;
    private final Integer room;


    //optional field
    private final Boolean isBuildingHouse;

    public String getType() {
        return type;
    }

    public String getHeight() {
        return height;
    }

    public Integer getRoom() {
        return room;
    }

    public Boolean getBuildingHouse() {
        return isBuildingHouse;
    }

    private House(HouseBuilder builder) {
        this.type = builder.type;
        this.height = builder.height;
        this.room = builder.room;
        this.isBuildingHouse = builder.isBuildingHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", height='" + height + '\'' +
                ", room=" + room +
                ", isBuildingHouse=" + isBuildingHouse +
                '}';
    }

    public static class HouseBuilder{

        private String type;
        private String height;
        private Integer room;
        private Boolean isBuildingHouse;



        public HouseBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public HouseBuilder setHeight(String height) {
            this.height = height;
            return this;
        }

        public HouseBuilder setRoom(Integer room) {
            this.room = room;
            return this;
        }

        public HouseBuilder setBuildingHouse(Boolean buildingHouse) {
            this.isBuildingHouse = buildingHouse;
            return this;
        }


        public House build(){
            return new House(this);
        }
    }

}
