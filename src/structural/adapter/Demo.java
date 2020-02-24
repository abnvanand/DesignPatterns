package structural.adapter;


import structural.adapter.legacycode.SquarePeg;
import structural.adapter.service.RoundHole;

public class Demo {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(new SquarePeg(5));
        System.out.println(roundHole.fits(squarePegAdapter));
    }
}
