package Task2.figure;

import Task2.exceptions.FigureException;

import java.util.Scanner;

public abstract class Figure {
    protected double length;
    protected double width;
    protected double height;
    protected double radius;
    protected double area;
    protected double volume;


    protected Figure() {
    }

    public abstract void calculateAreaAndVolume();

    protected static double validateNumbers(String msg) {
        Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Введите " + msg);
                String num = sc.nextLine().trim();

                if (num.isEmpty()) {
                    throw new FigureException("Число не можеть быть пустым");
                }

                double value = Double.parseDouble(num);

                if (value <= 0) {
                    throw new FigureException("Число должно быть больше 0");
                }

                return value;
            } catch (NumberFormatException e) {
                throw new FigureException("Число не может быть строкой");
            }

    }
}
