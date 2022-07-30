package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final double height;
    private final double upperBase;
    private final double lowerBase;
    private final Color color;

    public IsoscelesTrapezoid(
            double height, double upperBase, double lowerBase, Color color) {
        this.height = height;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) / 2 * height;
    }

    @Override
    public String getFigureInfo() {
        return "Figure: isosceles trapezoid Area: "
                + getArea() + " sq.units"
                + " Upper base: " + upperBase + " units"
                + " Lower base: " + lowerBase + " units"
                + " Height: " + height + " units"
                + " Color: " + color + "\n";
    }

}
