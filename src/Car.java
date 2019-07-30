public abstract class Car {
    String model;
    int speed;
    String color;

    void gas (int speed)
        {
            System.out.println("gas:" + speed);
        }

    void brake (int brake)
        {
            System.out.println("brake:" + brake);
        }
    abstract void descriotion();
}
