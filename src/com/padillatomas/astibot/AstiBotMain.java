package com.padillatomas.astibot;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AstiBotMain {
    public static void main(String[] args) {

//        Ejercicio 1:

        System.out.println("Ingrese un numero entre 100 y 200, Luego recibirá todos los números pares comprendidos entre el número facilitado y 200");
        Scanner reader = new Scanner(System.in);
        int myNumber = reader.nextInt();
        if(myNumber >= 100 && myNumber <=200){
            for(int i = myNumber; i <= 200; i++){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        }

//        Ejericio 2:
        System.out.println("Ingrese una palabra o frase:");
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String stringReader = sc.nextLine();

        System.out.println("Ingrese un caracter a repetir:");
        String caracterElegido = sc2.nextLine();

        String originalString = stringReader;
        String adjusted = originalString.replaceAll(caracterElegido,caracterElegido+caracterElegido);

        System.out.println(adjusted);




    }
}
