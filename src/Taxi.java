public class Taxi extends Public_Transportation {
    int distance;
    int distanceMoney;
    int paysum;


    public Taxi(){
        number = (int)(Math.random()*9000) + 1000;
        maxPassengerCount = 4;
        money = 3000;
        state = 2;
        distanceMoney = 1000;
        distance = 1;
        speed = 0;
        System.out.println(number+"번 택시");
        System.out.println("주유량 = "+oil);
        System.out.println("상태 = 일반");
    }

    public void ride(int person, String dstn, int distc){
        if(maxPassengerCount < person || state == 0){
            System.out.println("최대 승객 수 초과");
        }else {
            state = 1;
            paysum += money+distanceMoney*(distc-1);
            System.out.println("탑승 승객 수 = "+person);
            System.out.println("잔여 승객 수 = "+(maxPassengerCount-person));
            System.out.println("기본 요금 확인 = "+money);
            System.out.println("목적지 = "+dstn);
            System.out.println("목적지까지 거리 = "+distc+"km");
            System.out.println("지불할 요금"+(money+distanceMoney*(distc-1)));
        }
    }

    public void pay(){
        if(oil <= 0){
            state = 0;
            System.out.println("주유량 = "+oil);
            System.out.println("상태 = 운행불가");
            System.out.println("누적요금 = "+paysum);
            System.out.println("주유가 필요합니다");
        }else {
            state = 2;
            System.out.println("주유량 = "+oil);
            System.out.println("누적요금 = "+paysum);
        }
    }

}