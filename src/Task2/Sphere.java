package Task2;

import Task2.figure.Figure;

public class Sphere extends Figure {

    public Sphere() {

    }

    @Override
    public void calculateAreaAndVolume() {
        radius = validateNumbers("радиус сферы: ");

        area = 4 * Math.PI * Math.pow(radius, 2);
        volume = (double) 4 / 3 * Math.PI * Math.pow(radius, 3);

        System.out.println("Площадь полной поверхности сферы: " + area);
        System.out.println("Объем сферы: " + volume);
    }
}
