public class Public_Transportation {
    public int state;
    public int number;
    public int oil = 100;
    public int speed = 0;
    public int money;
    public int maxPassengerCount;
    public int maxSum;

    public void ride(int person){
        if(maxPassengerCount - person <= 0 || state == 0) {
            System.out.println("최대 승객 수 초과");
        } else if (maxPassengerCount - person > 0 && state == 1) {
            maxSum = maxPassengerCount - person;
            System.out.println("탑승 승객 수 = "+person);
            System.out.println("잔여 승객 수 = "+(maxSum));
            System.out.println("요금 확인 = "+money*person);
        }
    }


    public void fuel(int fuelr){
        oil += fuelr;
        if(oil < 10){
            state = 0;
            System.out.println("주유량 = "+oil);
            System.out.println("주유가 필요합니다");
            System.out.println("상태 = 차고지행");
        } else if (oil > 10) {
            state = 1;
            System.out.println("주유량 = "+oil);
            System.out.println("운행");
        }
    }

    public void stateCz(String st){
        if(st.length() == 3){
            state = 1;
            System.out.println("운행중");
        }else if(st.length() == 2) {
            state = 2;
            System.out.println("일반");
        }else{
            state = 0;
            System.out.println("운행불가");
        }
    }

    public void speed(int sp){
        speed += sp;
        if(speed <= 0){
            state = 0;
            System.out.println("운행이 멈춥니다");
            System.out.println("현재 속도 = "+speed);
        } else{
            if(oil < 10){
                state = 0;
                System.out.println("주유량 = "+oil);
                System.out.println("주유가 필요합니다");
                System.out.println("차고지행");
            } else if (oil > 10) {
                state = 1;
                System.out.println("주유량 = "+oil);
                System.out.println("운행");
            }
        }
    }

}
