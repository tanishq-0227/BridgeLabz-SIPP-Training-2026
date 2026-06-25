public abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double area();

    public abstract double perimeter();

    public String getShapeName() {
        return shapeName;
    }
}
