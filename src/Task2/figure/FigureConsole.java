package Task2.figure;

import Task2.Cone;
import Task2.Cylinder;
import Task2.Parallelepiped;
import Task2.Sphere;
import Task2.exceptions.FigureException;

public class FigureConsole {

    public FigureConsole() {

    }

    public void runCalculation() {
        Figure parallelepiped = new Parallelepiped();
        Figure sphere = new Sphere();
        Figure cylinder = new Cylinder();
        Figure cone = new Cone();

        int choice = validateAskFigure();

        switch (choice) {
            case 1:
                validateFigure(parallelepiped);
                break;
            case 2:
                validateFigure(sphere);
                break;
            case 3:
                validateFigure(cylinder);
                break;
            case 4:
                validateFigure(cone);
                break;
            default:
        }
    }

    public static int validateAskFigure() {
        while (true) {
            try {
                int value = (int) Figure.validateNumbers("фигуру для расчета: 1. Параллелепипед 2. Сфера 3. Цилиндр 4. Конус");

                if (value > 4) {
                    throw new FigureException("Вы выбрали не существующий индекс фигуры");
                }

                return value;
            } catch (FigureException e) {
                e.printStackTrace();
            }
        }
    }

    public static void validateFigure(Figure figure) {
        while (true) {
            try {
                figure.calculateAreaAndVolume();
                break;
            } catch (FigureException e) {
                e.printStackTrace();
            }
        }
    }
}
