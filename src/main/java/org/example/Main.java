package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        // Alternativschreibweise
        // int [] array = new int[] {1, 2, 3, 4, 5};

        // Array ausgeben
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Einen Wert zum Array hinzufügen
        int neueZahl = 6;
        // Wir machen die ursprüngliche Größe um 1 größer
        int newArrayLength = array.length + 1;
        int [] array_bigger = new int[newArrayLength];

        // Wir kopieren das alte Array ins neue Array
        for (int i = 0; i < array.length; i++) {
            array_bigger[i] = array[i];
        }
        // Wir fügen den neuen Wert zum neuen Array hinzu
        array_bigger[array.length] = neueZahl;

        System.out.println("Array vor Löschen von Zahl 3: " + Arrays.toString(array_bigger));

        // TODO: Eine Zahl aus dem Array löschen z.B. die Zahl 3
        // .delete() ... wäre praktisch
        // D.h. die Länge vom Array wird kleiner
        int [] array_smaller = new int[newArrayLength - 1];

        for (int i = 0; i < array_smaller.length; i++) {

        }

        System.out.println("Array nach Löschen von Zahl 3: " + Arrays.toString(array_smaller));

    }


}