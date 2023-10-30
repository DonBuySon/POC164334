public class TestCar{
    public static void main(String[] args) {
        Car c1= new Car();
        System.out.println(c1.speed);
        c1.accelerate(80);
        System.out.println(c1.speed);
        c1.decelerate(50);
        System.out.println(c1.speed);
    }
}

class Car {
    String brand;
    String model;
    int speed;

    void accelerate(int value){
        this.speed += value;
    }

    void decelerate(int value){
        this.speed -= value;
        if (speed < 0){
            speed = 0;
        }
    }
}