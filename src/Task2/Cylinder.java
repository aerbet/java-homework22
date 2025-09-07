package Task2;

import Task2.figure.Figure;

import java.util.Scanner;

public class Cylinder extends Figure {

    public Cylinder() {
    }

    @Override
    public void calculateAreaAndVolume() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус цилиндра: ");
        radius = sc.nextDouble();
        System.out.print("Введите высоту цилиндра: ");
        height = sc.nextDouble();

        double cylSideArea = 2 * Math.PI * (radius * height);
        area = 2 * Math.PI * Math.pow(radius, 2) + cylSideArea;
        volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("Площадь боковой поверхности цилиндра: " + cylSideArea);
        System.out.println("Площадь полной поверхности цилиндра: " + area);
        System.out.println("Объем цилиндра: " + volume);
    }
}
