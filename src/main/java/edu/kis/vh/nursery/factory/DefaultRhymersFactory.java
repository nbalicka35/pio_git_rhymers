package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultRhymer;
import edu.kis.vh.nursery.FIFOrhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public defaultRhymer GetStandardRhymer() {
        return new defaultRhymer();
    }

    @Override
    public defaultRhymer GetFalseRhymer() {
        return new defaultRhymer();
    }

    @Override
    public defaultRhymer GetFIFORhymer() {
        return new FIFOrhymer();
    }

    @Override
    public defaultRhymer GetHanoiRhymer() {
        return new HanoiRhymer();
    }

}
