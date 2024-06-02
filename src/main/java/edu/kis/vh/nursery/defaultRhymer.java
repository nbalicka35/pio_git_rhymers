package edu.kis.vh.nursery;

public class defaultRhymer {

    private final int[] NUMBERS = new int[12];
    private final int STACK_IS_EMPTY = -1;
    private int total = -1;

    public int getTotal() {
        return total;
    }
    /**
     * Adds a number to the stack if it is not full.
     *
     * @param in - number to be added
     */
    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }
    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false if it's not
     */
    protected boolean check() {
        return total == -1;
    }


    /**
     * Checks if the stack is full.
     *
     * @return true if the stack is full, false if it's not
     */
            protected boolean isFull() {
                return total == 11;
            }
    /**
     * Returns top value of the stack.
     *
     * @return value at the top of stack - if stack is empty returns STACK_IS_EMPTY
     */
                protected int getLastNumber() {
                    if (check())
                        return STACK_IS_EMPTY;
                    return NUMBERS[total];
                }
    /**
     * Removes and returns the value at the top of the stack.
     *
     * @return value at the top of stack - if stack is empty returns STACK_IS_EMPTY
     */
                    protected int getPenultimateNumber() {
                        if (check())
                            return STACK_IS_EMPTY;
                        return NUMBERS[total--];
                    }
    /**
     * Returns the current stack.
     *
     * @return current stack
     */
    public int[] getNUMBERS() {
        return NUMBERS;
    }


}
