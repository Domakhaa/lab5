package Classes;

public class Vehicle {

        static Integer num;
        static {
                num = 1;
        }

        public Vehicle() {
                id = num++;
        }

        private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
        private String name; //Поле не может быть null, Строка не может быть пустой
        private Coordinates coordinates; //Поле не может быть null
        private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
        private Float enginePower; //Поле может быть null, Значение поля должно быть больше 0
        private VehicleType type; //Поле не может быть null
        private FuelType fuelType; //Поле может быть null




        public void setName(String name) {
                if (name == null || name.isEmpty()) {
                        System.out.println("ОШИБКА");

                }
                this.name = name;
        }

        public void setCoordinates(Integer x, float y) {
                if (coordinates == null) {
                        System.out.println("ОШИБКА");
                }
                this.coordinates = new Coordinates(x, y);
        }


        public void setEnginePower(Float enginePower) {
                if (enginePower == null || enginePower <= 0) {
                        System.out.println("ОШИБКА");
                }
                this.enginePower = enginePower;
        }


        public void setType(VehicleType type) {
                if (type == null) {
                        System.out.println("ОШИБКА");
                }
                this.type = type;
        }

        public void setFuelType(FuelType fuelType) {
                if (fuelType == null) {
                        System.out.println("ОШИБКА");
                }
                this.fuelType = fuelType;
        }

}
