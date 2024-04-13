package edu.kis.vh.nursery;

public class FIFOrhymer extends defaultRhymer {

    public defaultRhymer temp = new defaultRhymer();
    
    @Override
    public int getPenultimateNumber() {
        while (!check())
            
        temp.countIn(super.getPenultimateNumber());
        
        int ret = temp.getPenultimateNumber();
        
        while (!temp.check())
            
        countIn(temp.getPenultimateNumber());
        
        return ret;
    }
}
