package rvt;

import java.util.HashMap;

public class IOU {

    private HashMap < String, Double > paradi;

    public IOU() {

        this.paradi = new HashMap <>();
    }

    public void liktsumm(String toWhom, double amount) {

        paradi. put(toWhom, amount);

    }

    public double cikparada(String toWhom) {

        return paradi.getOrDefault(toWhom, 0.0);

    }

}

    class Main {

        public static void main (String[] args) {
            IOU mattsIOU = new IOU();
            mattsIOU.liktsumm ("nikalas", 9.5);
            mattsIOU.liktsumm("ammanda", 80);

            System.out.println (mattsIOU.cikparada("nikalas"));
            System.out.println(mattsIOU.cikparada("ammanda"));

            mattsIOU.liktsumm("edmunds", 11.5);
            System.out.println(mattsIOU.cikparada("edmunds"));
        }
    }