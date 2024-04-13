package edu.kis.vh.nursery;

public class FIFOrhymer extends defaultRhymer {

    public defaultRhymer temp = new defaultRhymer();
    
    @Override
    public int countOut() {
        while (!callCheck())
            
        temp.countIn(super.countOut());
        
        int ret = temp.countOut();
        
        while (!temp.callCheck())
            
        countIn(temp.countOut());
        
        return ret;
    }
}
