package Task2;

import Task2.figure.Figure;

public class Cylinder extends Figure {

    public Cylinder() {
    }

    @Override
    public void calculateAreaAndVolume() {
        radius = validateNumbers("радиус цилиндра: ");
        height = validateNumbers("высоту цилиндра: ");

        double cylSideArea = 2 * Math.PI * (radius * height);
        area = 2 * Math.PI * Math.pow(radius, 2) + cylSideArea;
        volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("Площадь боковой поверхности цилиндра: " + cylSideArea);
        System.out.println("Площадь полной поверхности цилиндра: " + area);
        System.out.println("Объем цилиндра: " + volume);
    }
}
