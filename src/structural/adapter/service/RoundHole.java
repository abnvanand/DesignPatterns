package structural.adapter.service;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.radius >= peg.getRadius());
        return result;
    }
}
