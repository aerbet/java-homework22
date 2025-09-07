package Task2.figure;

import Task2.Cone;
import Task2.Cylinder;
import Task2.Parallelepiped;
import Task2.Sphere;

import java.util.Scanner;

public class FigureConsole  {
    public static void main(String[] args) {
        Figure parallelepiped = new Parallelepiped();
        Figure sphere = new Sphere();
        Figure cylinder = new Cylinder();
        Figure cone = new Cone();


        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите фигуру для расчета: 1. Параллелепипед 2. Сфера 3. Цилиндр 4. Конус");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                parallelepiped.calculateAreaAndVolume();
                break;
            case 2:
                sphere.calculateAreaAndVolume();
                break;
            case 3:
                cylinder.calculateAreaAndVolume();
                break;
            case 4:
                cone.calculateAreaAndVolume();
                break;
            default:
        }
    }
}
