package com.java;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String name,gender, school = "Hyperion";
       

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your Name :");
         name = scan.nextLine();



        System.out.println("Enter your Gender using this option:  \nMale = 1 \nFemale = 2 ");
        int ask = scan.nextInt();

        if(ask == 1) {
            gender = "Mr";
        } else if(ask == 2) {
             gender = "Mrs";
        } else{
            gender = "Alien";
        }


        if( name.length() >= 0){
            System.out.println("You are welcome"+" "+gender+" "+name +" coding at"+school  );
            // System.out.println(name.endsWith("e") + " "+ name);
        }



     }
}
