package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultRhymer {

    private int totalRejected = 0;

    protected int RejectedReports() {
        return totalRejected;
    }

    protected void countIn(int in) {
        if (!check() && in > getLastNumber())
            totalRejected++;
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }


}
