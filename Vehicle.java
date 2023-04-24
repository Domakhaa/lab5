package Classes;

public class Vehicle {

        static Integer num;
        static {
                num = 1;
        }

        public Vehicle() {
                id = num++;
        }

        private Integer id; //���� �� ����� ���� null, �������� ���� ������ ���� ������ 0, �������� ����� ���� ������ ���� ����������, �������� ����� ���� ������ �������������� �������������
        private String name; //���� �� ����� ���� null, ������ �� ����� ���� ������
        private Coordinates coordinates; //���� �� ����� ���� null
        private java.time.LocalDateTime creationDate; //���� �� ����� ���� null, �������� ����� ���� ������ �������������� �������������
        private Float enginePower; //���� ����� ���� null, �������� ���� ������ ���� ������ 0
        private VehicleType type; //���� �� ����� ���� null
        private FuelType fuelType; //���� ����� ���� null




        public void setName(String name) {
                if (name == null || name.isEmpty()) {
                        System.out.println("������");

                }
                this.name = name;
        }

        public void setCoordinates(Integer x, float y) {
                if (coordinates == null) {
                        System.out.println("������");
                }
                this.coordinates = new Coordinates(x, y);
        }


        public void setEnginePower(Float enginePower) {
                if (enginePower == null || enginePower <= 0) {
                        System.out.println("������");
                }
                this.enginePower = enginePower;
        }


        public void setType(VehicleType type) {
                if (type == null) {
                        System.out.println("������");
                }
                this.type = type;
        }

        public void setFuelType(FuelType fuelType) {
                if (fuelType == null) {
                        System.out.println("������");
                }
                this.fuelType = fuelType;
        }

}
