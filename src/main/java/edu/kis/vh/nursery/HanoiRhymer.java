package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultRhymer {

    int totalRejected = 0;

    public int RejectedReports() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!check() && in > getLastNumber())
            totalRejected++;
        else
            super.countIn(in);
    }
}
