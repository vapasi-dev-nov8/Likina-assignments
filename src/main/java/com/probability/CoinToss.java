package com.probability;

import java.util.Objects;

public class CoinToss {


    private double probability;
    private OutCome outCome;

    public CoinToss(double probability, OutCome outCome) {
        this.probability = probability;
        this.outCome = outCome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoinToss coinToss = (CoinToss) o;
        String type = this.outCome.tossType(outCome);
        if (type.equals("FLIPONCE")) {
            return Double.compare(coinToss.probability, probability) == 0;
        }
        return Double.compare(coinToss.probability, probability) == 0 && outCome == coinToss.outCome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(probability, outCome);
    }

    public CoinToss toss(CoinToss coinToss) {
        double value = outCome.probabilityOnToss(coinToss.outCome);
        coinToss.probability = value;
        return coinToss;
    }


    public CoinToss probabilityOfEitherTwoEvents(CoinToss coinToss) {
        double value = outCome.probabilityOfEitherTwoEventsOccuringOnToss(coinToss.outCome);
        coinToss.probability = value;
        return coinToss;
    }

}
