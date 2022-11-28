package org.eudy.arias.services;


import java.util.Scanner;

public class InputTextService {
    public static String Text(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static String TextWithLabel(String campo){
        System.out.println(""+campo);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}

