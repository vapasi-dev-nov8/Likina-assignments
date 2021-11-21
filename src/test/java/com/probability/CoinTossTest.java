package com.probability;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTossTest {


    // Probability of a head in a coin toss is equal to the probability of a tail in a coin toss.
    @Test
    void probabilityOfHeadEqualsTailInAToss() {
        //Given
        CoinToss headOccurrenceInAToss = new CoinToss(0.5, OutCome.H);

        //When
        CoinToss tailOccurrenceInAToss = headOccurrenceInAToss.toss(new CoinToss(0.0, OutCome.T));

        assertTrue(headOccurrenceInAToss.equals(tailOccurrenceInAToss));

    }

    // Probability of a tail in a coin toss is equal to the probability of a head in a coin toss.
    @Test
    void probabilityOfTailEqualsHeadInAToss() {
        //Given
        CoinToss tailOccurrenceInAToss = new CoinToss(0.5, OutCome.T);

        //When
        CoinToss headOccurrenceInAToss = tailOccurrenceInAToss.toss(new CoinToss(0.0, OutCome.H));

        assertTrue(tailOccurrenceInAToss.equals(headOccurrenceInAToss));

    }

    // Probability of Two events occurring together [HH]
    @Test
    void probabilityOfTwoEventsHHOccurringTogether() {
        //Given
        CoinToss headOccurrenceInTwoToss = new CoinToss(0.25, OutCome.HH);

        //When
        CoinToss occurrenceOfHHInTwoToss = headOccurrenceInTwoToss.toss(new CoinToss(0.0, OutCome.HH));

        assertTrue(headOccurrenceInTwoToss.equals(occurrenceOfHHInTwoToss));

    }

    // Probability of Two events occurring together [TH]
    @Test
    void probabilityOfTwoEventsTHOccurringTogether() {
        //Given
        CoinToss tailHeadOccurrenceInTwoToss = new CoinToss(0.25, OutCome.TH);

        //When
        CoinToss occurrenceOfTHInTwoToss = tailHeadOccurrenceInTwoToss.toss(new CoinToss(0.0, OutCome.TH));

        assertTrue(tailHeadOccurrenceInTwoToss.equals(occurrenceOfTHInTwoToss));

    }

    // Probability of Two events occurring together [HT]
    @Test
    void probabilityOfTwoEventsHTOccurringTogether() {
        //Given
        CoinToss headTailOccurrenceInTwoToss = new CoinToss(0.25, OutCome.HT);

        //When
        CoinToss occurrenceOfHTInTwoToss = headTailOccurrenceInTwoToss.toss(new CoinToss(0.0, OutCome.HT));

        assertTrue(headTailOccurrenceInTwoToss.equals(occurrenceOfHTInTwoToss));

    }

    // Probability of Two events occurring together [TT]
    @Test
    void probabilityOfTwoEventsTTOccurringTogether() {
        //Given
        CoinToss tailOccurrenceInTwoToss = new CoinToss(0.25, OutCome.TT);

        //When
        CoinToss occurrenceOfTTInTwoToss = tailOccurrenceInTwoToss.toss(new CoinToss(0.0, OutCome.TT));

        assertTrue(tailOccurrenceInTwoToss.equals(occurrenceOfTTInTwoToss));

    }

    // Probability of No heads occurring
    @Test
    void probabilityOfNoHeadsOccuring() {
        //Given
        CoinToss noHeadOccurrenceInTwoToss = new CoinToss(0.25, OutCome.TT);

        //When
        CoinToss occurrenceOfNoHeadInTwoToss = noHeadOccurrenceInTwoToss.toss(new CoinToss(0.0, OutCome.TT));
        assertTrue(noHeadOccurrenceInTwoToss.equals(occurrenceOfNoHeadInTwoToss));


    }

    // Probability of No tails occurring
    @Test
    void probabilityOfNoTailsOccuring() {
        //Given
        CoinToss noTailOccurrenceInTwoToss = new CoinToss(0.25, OutCome.HH);

        //When
        CoinToss occurrenceOfNoTailInTwoToss = noTailOccurrenceInTwoToss.toss(new CoinToss(0.0, OutCome.HH));

        assertTrue(noTailOccurrenceInTwoToss.equals(occurrenceOfNoTailInTwoToss));


    }

    // Probability of either two events occurring [HH or TT or HT]
    @Test
    void probabilityOfEitherTwoEventsOccuring() {
        //Given
        CoinToss eitherTwoEventsOccurring = new CoinToss(0.75, OutCome.HT);

        //When
        CoinToss occurrenceOfEitherTwoEvents = eitherTwoEventsOccurring.probabilityOfEitherTwoEvents(new CoinToss(0.0, OutCome.HT));

        assertTrue(eitherTwoEventsOccurring.equals(occurrenceOfEitherTwoEvents));


    }
}