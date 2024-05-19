package edu.kis.vh.nursery;

public class FIFOrhymer extends defaultRhymer {

    private final defaultRhymer temp = new defaultRhymer();
    
    @Override
    protected int getPenultimateNumber() {
        while (!check())
            
        temp.countIn(super.getPenultimateNumber());
        
        int ret = temp.getPenultimateNumber();
        
        while (!temp.check())
            
        countIn(temp.getPenultimateNumber());
        
        return ret;
    }

    public defaultRhymer getTemp() {
        return temp;
    }
}
