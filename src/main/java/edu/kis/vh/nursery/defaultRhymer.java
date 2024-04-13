package edu.kis.vh.nursery;

public class defaultRhymer {

    private int[] NUMBERS = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean check() {
            return total == -1;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int getLastNumber() {
                    if (check())
                        return -1;
                    return NUMBERS[total];
                }
            
                    public int getPenultimateNumber() {
                        if (check())
                            return -1;
                        return NUMBERS[total--];
                    }

}
