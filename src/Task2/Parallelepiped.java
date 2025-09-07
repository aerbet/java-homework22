package Task2;

import Task2.figure.Figure;

import java.util.Scanner;

public class Parallelepiped extends Figure {

    public Parallelepiped() {

    }

    @Override
    public void calculateAreaAndVolume() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину параллелепипеда: ");
        length = sc.nextDouble();
        System.out.print("Введите ширину параллелепипеда: ");
        width = sc.nextDouble();
        System.out.print("Введите высоту параллелепипеда: ");
        height = sc.nextDouble();

        area = 2 * (length * width + width * height + length * height);
        volume = length * width * height;

        System.out.println("Площадь полной поверхности параллелепипеда: " + area);
        System.out.println("Объем параллелепипеда: " + volume);
    }
}
