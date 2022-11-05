package udemycodingexercises;

public class MainClass {
    public static void main(String[] args) {
//    exercise 1 - speed converter
        SpeedConverter.printConversion(160);

//        exercise 2- KB to MB and KB
        MegaBytesConverter.printMegaBytesAndKiloBytes(652341);

//      exercise 3
//      barking dog

        boolean result = BarkingDOg.shouldWakeUp(true, 10);
        System.out.println("shouldWakeUp is : "+result);

        result = BarkingDOg.shouldWakeUp(false, 10);
        System.out.println("shouldWakeUp is : "+result);

        result = BarkingDOg.shouldWakeUp(true, 2);
        System.out.println("shouldWakeUp is : "+result);

        result = BarkingDOg.shouldWakeUp(true, 23);
        System.out.println("shouldWakeUp is : "+result);

        result = BarkingDOg.shouldWakeUp(false, 5);
        System.out.println("shouldWakeUp is : "+result);

        result = BarkingDOg.shouldWakeUp(true, 0);
        System.out.println("shouldWakeUp is : "+result);
        result = BarkingDOg.shouldWakeUp(true, 25);
        System.out.println("shouldWakeUp is : "+result);

        result = BarkingDOg.shouldWakeUp(true, -5);
        System.out.println("shouldWakeUp (for negative he) is : "+result);
    }
}
