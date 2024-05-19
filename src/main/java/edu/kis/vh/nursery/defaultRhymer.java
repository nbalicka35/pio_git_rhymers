package edu.kis.vh.nursery;

public class defaultRhymer {

    private final int[] NUMBERS = new int[12];

    private int total = -1;

    public int getTotal() {
        return total;
    }

    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean check() {
        return total == -1;
    }

            protected boolean isFull() {
                return total == 11;
            }

                protected int getLastNumber() {
                    if (check())
                        return -1;
                    return NUMBERS[total];
                }

                    protected int getPenultimateNumber() {
                        if (check())
                            return -1;
                        return NUMBERS[total--];
                    }

}
