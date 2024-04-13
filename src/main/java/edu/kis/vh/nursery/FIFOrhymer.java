package edu.kis.vh.nursery;

public class FIFOrhymer extends defaultRhymer {

    public defaultRhymer temp = new defaultRhymer();
    
    @Override
    public int countOut() {
        while (!check())
            
        temp.countIn(super.countOut());
        
        int ret = temp.countOut();
        
        while (!temp.check())
            
        countIn(temp.countOut());
        
        return ret;
    }
}
