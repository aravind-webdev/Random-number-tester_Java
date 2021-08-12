package com.opencodeonce;  //change the packagename
import java.util.*;
import java.lang.*;       //import Math library
public class Random {
    public static void main(String[] args) {
        int result,number,time;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of times:");
        time=sc.nextInt();
        for (int i=1;i<=time;i++){
          int a=(int)(Math.random()*100);
          int b=(int)(Math.random()*100);
          result=a+b;
          System.out.println(a+"+"+b+"=");
          number=sc.nextInt();
            if(number==result){
                System.out.println("Correct answer");
            }
            else {
                System.out.println("Wrong answer the correct answer is:"+result);
            }
           }
        System.out.println("Program Over");
    //codeby:openoncecode/github
    }
}
