package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultRhymer;
import edu.kis.vh.nursery.FIFOrhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public defaultRhymer getStandardRhymer() {
        return new defaultRhymer();
    }

    @Override
    public defaultRhymer getFalseRhymer() {
        return new defaultRhymer();
    }

    @Override
    public defaultRhymer getFIFORhymer() {
        return new FIFOrhymer();
    }

    @Override
    public defaultRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
