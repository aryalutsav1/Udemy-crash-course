package udemyvideopractice;

import java.util.Scanner;

public class PrimitiveIntegerPractice {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//
//        byte mybyte = 10;
//        short myshort = 20;
//        int myint = 50;
//        long mylong = 50000;
//        System.out.println(mybyte);
//        System.out.println(myshort);
//        System.out.println(myint);
//        System.out.println(mylong);
//
//        long myFinalLong = mylong + 10*(mybyte+myshort+myint);
//        System.out.println("My final long Value is :- "+myFinalLong);
//
//        double mypound = 200;
//        double mypoundToKilo = mypound *0.45359237;
//        System.out.println(mypound +" lb is equal to "+mypoundToKilo+" kg.");
//
//        int a =5;
//        int b=6;
//        int c ;
//        c=a;
//        a=b;
//        b=c;
//        System.out.println(a);
//        System.out.println(b);

//        for (int x =10;x>=1; x--){
//            System.out.println(x);
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = scan.nextInt();
//
//        int a = 0;
//        int b = 1;
//
//        for(int i=1;i<=n;i++){
//            int sum = a + b;
//            a=b;
//            b=sum;
//            System.out.println(sum);
//        }
//
//
//    }

    int numb1=0;
    int numb2=1;
    int x=1;
    Scanner integer1 = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int co = integer1.nextInt();
    while ( x <=co){
        int sum = numb1+numb2;
        System.out.print(sum+",");
        numb1=numb2;
        numb2=sum;
        x++;
    }

}}