package Task2.figure;

public abstract class Figure {
    protected double length;
    protected double width;
    protected double height;
    protected double radius;
    protected double area;
    protected double volume;


    public Figure() {
    }

    public abstract void calculateAreaAndVolume();

}
