package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        defaultRhymer rhymer = new defaultRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.getLastNumber();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        defaultRhymer rhymer = new defaultRhymer();
        boolean result = rhymer.check();
        Assert.assertEquals(true, result);

        rhymer.countIn(888);

        result = rhymer.check();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        defaultRhymer rhymer = new defaultRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        defaultRhymer rhymer = new defaultRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.getLastNumber();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.getLastNumber();
        Assert.assertEquals(testValue, result);
        result = rhymer.getLastNumber();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        defaultRhymer rhymer = new defaultRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.getPenultimateNumber();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.getPenultimateNumber();
        Assert.assertEquals(testValue, result);
        result = rhymer.getPenultimateNumber();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
