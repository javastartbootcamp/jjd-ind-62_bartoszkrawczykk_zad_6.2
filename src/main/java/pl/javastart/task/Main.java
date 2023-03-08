package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy:");
        int tmp = sc.nextInt();
        System.out.println("Wprowadź 5 liczb:");

        int[] numbers = new int[tmp];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        for (int i = 1; i < numbers.length; i++) {
            sum = (numbers[0] * numbers[0]) + (numbers[1] * numbers[1]) + (numbers[2] * numbers[2]) +
                    (numbers[3] * numbers[3] + (numbers[4] * numbers[4]));
        }
        System.out.println("Suma kwadratów wprowadzonych liczb to " + sum);
    }
}