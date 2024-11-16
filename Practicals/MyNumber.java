public class MyNumber {
    private double num;

    public MyNumber(double num) {
        this.num = num;
    }

    public double getRoundValue() {
        double numRound = Math.round(num);
        return numRound;
    }

    public double getCeilValue() {
        double numCeil = Math.ceil(num);
        return numCeil;
    }

    public double getFloorValue() {
        double numFloor = Math.floor(num);
        return numFloor;
    }

public int getIntegerValue() {
    int numInteger = (int) num;
    return numInteger;
}

public static void main(String[] args) {
    MyNumber myNumber = new MyNumber(7.65);

    System.out.println("Original number: " + myNumber.num);
    System.out.println("Rounded value: " + myNumber.getRoundValue());
    System.out.println("Ceil value" + myNumber.getCeilValue());
    System.out.println("Floor value " + myNumber.getFloorValue());
    System.out.println("Integer cast value: " + myNumber.getIntegerValue());
}
 
}