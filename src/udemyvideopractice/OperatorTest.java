package udemyvideopractice;

public class OperatorTest {

    public static void main(String[] args){

        double val1 = 20.00;
        double val2 = 80.00;
        double val3 = (val1 + val2)*100;
        System.out.println("The value of val3 is : "+val3);
        double remainder = val3 %40;
        System.out.println("The remainder is : "+remainder);
        boolean isRemainder = (remainder==0 ? true:false);
        System.out.println("The value of the boolean is : "+ isRemainder);

        if (!isRemainder){
            System.out.println("Got some remainder.");
        }

        }

}
