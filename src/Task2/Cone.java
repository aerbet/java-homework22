package Task2;

import Task2.figure.Figure;

public class Cone extends Figure {
    public Cone() {
    }

    @Override
    public void calculateAreaAndVolume() {
        radius = validateNumbers("радиус конуса: ");
        height = validateNumbers("высоту конуса: ");

        double coneSideArea = Math.PI * (radius * height);
        area = coneSideArea + Math.PI * Math.pow(radius, 2);
        volume = (double) 1 / 3 * Math.PI * Math.pow(radius, 2) * height;

        System.out.println("Площадь боковой поверхности конуса: " + coneSideArea);
        System.out.println("Площадь полной поверхности конуса: " + area);
        System.out.println("Объем конуса: " + volume);
    }
}
