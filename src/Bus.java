public class Bus extends Public_Transportation {
    public Bus() {
        number = (int)(Math.random()*9000) + 1000;
        maxPassengerCount = 30;
        money = 1000;
        state = 1;
        System.out.println(number+"번 버스");

    }

}