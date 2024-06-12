package main_Utilits_;

public class Apartment_15 {


        private int area;
        private int numberOfRooms;
        private int floor;
        private String address;
        private int bus;
        boolean balkon;
        int erdGeschos;

        public Apartment_15 (int area, int numberOfRooms, int floor, boolean balkon, int bus, String address, int erdGeschos ) {
            this.area = area;
            this.numberOfRooms = numberOfRooms;
            this.floor = floor;
            this.address = address;
            this.balkon = balkon;
            this.bus = bus;
            this.erdGeschos = erdGeschos;
        }

        public void acepted() {
            System.out.println("Подходит! Одобрено!" + address);
        }
// Getter
        public int getArea() {
            return this.area;
        }

        public int getNumberOfRooms() {
            return  this.numberOfRooms;
        }

        public int getFloor() {
            return floor;
        }

        public String getAddress() {
             return address;
        }

         public boolean getBalkon() {
             return balkon;
        }

        public int getBus() {
             return bus;
        }

  //      public void getErdGeschos(boolean erdGeschos) {
    //        return erdGeschos;
        }
    /*
        public void setFloor(int, boolean); {
                 if (floor != 0 || !erdGeschos);
                 if (floor < 0 || floor > 30) return;
                 if (floor == 0);  {
                    System.out.println(" Этаж на земле (erdGeschos): " + erdGeschos);
                }
                 this.floor = floor;





        }

        public void setName(String name) {
            this.name = name;
        }

        public void setWeight(int weight) {
            if (weight < 0 ) return;
            this.weight = weight;
*/







