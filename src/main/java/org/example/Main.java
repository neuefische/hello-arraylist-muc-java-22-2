package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        // Alternativschreibweise
        // int [] array = new int[] {1, 2, 3, 4, 5};

        // Array ausgeben
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        /*
         * Einen Wert zum Array hinzufügen
         */

        int neueZahl = 6;
        // Wir machen die ursprüngliche Größe um 1 größer
        int newArrayLength = array.length + 1;

        // Primitive Datentypen
        // int
        // boolean
        // char
        // float
        // double

        // Komplexe Datentypen
        // String, Integer
        // ^Beachte Großschreibung

        // int (primitiv) = Integer (komplex)
        Integer [] array_bigger = new Integer[newArrayLength];

        // Wir kopieren das alte Array ins neue Array
        for (int i = 0; i < array.length; i++) {
            array_bigger[i] = array[i];
        }
        // Wir fügen den neuen Wert zum neuen Array hinzu
        array_bigger[array.length] = neueZahl;

        /*
         * Einen Wert aus dem Array löschen
         */

        System.out.println("Array vor Löschen von Zahl 3: " + Arrays.toString(array_bigger));

        // Eine Zahl aus dem Array löschen z.B. die Zahl 3
        // Die Länge vom Array wird kleiner
        int [] array_smaller = new int[newArrayLength - 1];

        for(int i = 0, j = 0; i<array_smaller.length;i++)
        {
            if (array_bigger[j] == 1) {
                j++;
            }
            array_smaller[i] = array_bigger[j];
            j++;
        }
        System.out.println("Array nach Löschen von der Zahl 3: " + Arrays.toString(array_smaller));

        /*
         * Erstellen von ArrayListen
        */

        // Es muss mit dem "new" Operator eine neue ArrayListe erstellt werden
        // In den spitzen Klammern muss der Typ der Daten angegeben werden
        List<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println("\n\nArrayliste original: " + arrayList);
        arrayList.remove(Integer.valueOf(3));
        System.out.println("Array nach Löschen von der Zahl 3: " + arrayList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Iulia");
        stringList.add("Fangfang");
        stringList.add("Maria");
        stringList.add("Sergej");

        System.out.println("stringList original: " + stringList);
        stringList.remove("Sergej");
        System.out.println("stringList nach Löschen von Sergej: " + stringList);
    }
}