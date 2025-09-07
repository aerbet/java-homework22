package Task2;

import Task2.exceptions.FigureException;
import Task2.figure.Figure;

public class Parallelepiped extends Figure {

    public Parallelepiped() {

    }

    @Override
    public void calculateAreaAndVolume() throws FigureException {
        length = validateNumbers("длину параллелепипеда: ");
        width = validateNumbers("ширину параллелепипеда: ");
        height = validateNumbers("высоту параллелепипеда: ");

        area = 2 * (length * width + width * height + length * height);
        volume = length * width * height;

        System.out.println("Площадь полной поверхности параллелепипеда: " + area);
        System.out.println("Объем параллелепипеда: " + volume);
    }
}
