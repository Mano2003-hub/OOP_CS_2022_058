package LW_01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your first name:");
        String firstname=scanner.next();
        System.out.println("Enter Your middle name:");
        String middlename=scanner.next();
        System.out.println("Enter Your last name:");
        String lastname=scanner.next();

        System.out.println(lastname+","+" "+firstname+middlename.substring(0,1)+".");


    }

}
