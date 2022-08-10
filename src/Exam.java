public class Exam {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

        bus1.ride(2);
        bus1.fuel(-50);
        bus1.stateCz("차고지행");
        bus1.fuel(10);
        bus1.ride(45);
        bus1.ride(5);
        bus1.fuel(-55);
//
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();

        taxi1.ride(2, "서울역", 2);
        taxi1.fuel(-80);
        taxi1.pay();
        taxi1.ride(5, "서울역", 2);
        taxi1.ride(3, "구로디지털단지역", 12);
        taxi1.fuel(-20);
        taxi1.pay();


    }
}