package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner INPUT = new Scanner(System.in);

        while (true) {
            ArrayList password = randPass(rand, INPUT, 0);
            for (int i = 0; i < password.size(); i++) {
                System.out.print(password.get(i));

            }
            System.out.println("\n\n\n");
        }

    }

    public static ArrayList randPass(Random rand, Scanner INPUT, int type){
        int int_random = 0;

        String[] passOption= {"1","2","3","4","5","6","7","8","9","0","`","~","!","@","#","$","%","^","&","*","(",")","-","_","+","=","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","{","}","[","]","|",":",";","?","/",".",",",">","<"," "};
        ArrayList password= new ArrayList();
            System.out.print("Length of Password: ");
            int passLength = INPUT.nextInt();


            for (int i = 0; i < passLength; i++) {
                if (type != 0){
                    int_random = (rand.nextInt(passOption.length) + rand.nextInt(passOption.length)) / 2;
            }
                else{
                    int_random = rand.nextInt(passOption.length);
                }
                password.add(passOption[int_random]);
            }

        return password;
    }

    }

