package Task2;

import Task2.figure.Figure;

import java.util.Scanner;

public class Cone extends Figure {
    public Cone() {
    }

    @Override
    public void calculateAreaAndVolume() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус конуса: ");
        radius = sc.nextDouble();
        System.out.print("Введите высоту конуса: ");
        height = sc.nextDouble();

        double coneSideArea = Math.PI * (radius * height);
        area = coneSideArea + Math.PI * Math.pow(radius, 2);
        volume = (double) 1 / 3 * Math.PI * Math.pow(radius, 2) * height;

        System.out.println("Площадь боковой поверхности конуса: " + coneSideArea);
        System.out.println("Площадь полной поверхности конуса: " + area);
        System.out.println("Объем конуса: " + volume);
    }
}
