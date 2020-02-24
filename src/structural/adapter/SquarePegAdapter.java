package structural.adapter;


import structural.adapter.service.RoundPeg;
import structural.adapter.legacycode.SquarePeg;

// SquarePegAdapter is of type RoundPeg so that it can be passed to RoundHole
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg peg) {
        this.squarePeg = peg;
    }

    @Override
    public double getRadius() {
        double result = Math.sqrt(Math.pow(squarePeg.getWidth() / 2, 2) * 2);
        return result;
    }
}
