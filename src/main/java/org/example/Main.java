package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> nombres = new HashMap<>();
        nombres.put(1, "Jorge");
        nombres.put(2, "Lisset");
        nombres.put(3, "Antony");
        System.out.println(nombres);
        nombres.remove(1);
        System.out.println(nombres);
        int key = 3;
        if (nombres.containsKey(key)){
            System.out.println("La clave " + key + " tiene el siguiente valor: " + nombres.get(key));
        }else {
            System.out.printf("La clave consultada no tiene ningun valor");
        }

        String [] apellidos = {"Rivera", "Rojas"};
        for (String i: apellidos){
            System.out.println(i);
        }


    }
}