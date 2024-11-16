public class Access {
    public void fullThrottle() {
System.out.println("The car is going fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        Access myCar = new Access();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}