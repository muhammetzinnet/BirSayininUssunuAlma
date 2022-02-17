package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int kok, us;
        int toplam = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kök sayınızı giriniz = ");
        kok = scanner.nextInt();

        System.out.print("Almak istediğiniz üssü giriniz = ");
        us = scanner.nextInt();

        for (int i = 1; i<=us; i++){
            toplam *= kok;
        }
        System.out.println("Sayımızın üslü gösterimi = "+toplam);
    }
}
