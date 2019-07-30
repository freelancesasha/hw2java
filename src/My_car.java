public class My_car extends Car {

    public static void main(String[] args) {

        My_car bus = new My_car("456", 4, "красній");
        bus.descriotion();
        bus.gas(4);
        bus.brake(56);

    }

    My_car (String model, int speed,String color)
    {
        this.model= model;
        this.speed = speed;
        this.color=color;
    }

    @Override
    void descriotion(){
        String a = model;
        int b = speed;
        String c = color;

        System.out.println("model "+a);
        System.out.println("speed "+b);
        System.out.println("color " +c);
    }
}


