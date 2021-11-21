package com.probability;

public enum OutCome {
    H(0.5, "FLIPONCE"), T(0.5, "FLIPONCE"),
    HH(0.25, "FLIPTWICE"), HT(0.25, "FLIPTWICE"), TH(0.25, "FLIPTWICE"), TT(0.25, "FLIPTWICE");

    /*H(0.5), T(0.5),
    HH(0.25), HT(0.25), TH(0.25), TT(0.25);*/
    private double probability;
    private String type;

    OutCome(double probability, String type) {
        this.probability = probability;
        this.type = type;
    }

    double probabilityOnToss(OutCome c) {
        return c.probability;
    }


    public double probabilityOfEitherTwoEventsOccuringOnToss(OutCome outCome) {
        return (1 - outCome.probability);
    }

    public String tossType(OutCome outCome) {
        return outCome.type;
    }
}