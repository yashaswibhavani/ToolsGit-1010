package com.nt.Gitproject_01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArithematicTest {

    
    @Test
    public void testsumwithpositives() {
    	Arthematic arth=new Arthematic();
    	int x=100;
    	int y=200;
    	int expected=300;
    	int actual=arth.sum(x,y);
    	
        assertEquals(expected,actual);
	
		
	
}
    @Test
    public void testsumwithnegative() {
    	Arthematic arth=new Arthematic();
    	int x=-100;
    	int y=200;
    	int expected=100;
    	int actual=arth.sum(x,y);
    	
        assertEquals(expected,actual);
	
    }
}
