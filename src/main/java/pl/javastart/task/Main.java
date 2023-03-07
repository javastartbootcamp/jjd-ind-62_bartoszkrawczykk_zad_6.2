package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy:");
        int tmp = sc.nextInt();
        System.out.println("Wprowadź 5 liczb:");

        int [] numbers = new int[tmp];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int suma : numbers) {
            System.out.println("Suma kwadratów wprowadzonych liczb to " + suma);
        }
        sc.close();
    }
}