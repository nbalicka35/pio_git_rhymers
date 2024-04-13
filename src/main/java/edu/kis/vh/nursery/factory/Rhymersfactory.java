package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultRhymer;

    public interface Rhymersfactory {
    
        public defaultRhymer GetStandardRhymer();
        
        public defaultRhymer GetFalseRhymer();
        
        public defaultRhymer GetFIFORhymer();
        
        public defaultRhymer GetHanoiRhymer();
        
    }
