package com.nt.GitProj_01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Arithematic {
private ArthTest arth;
    
    @Test
    public void testsumwithpositives() {
    	int x=100;
    	int y=200;
    	int expected=300;
    	int actual=arth.sum(x,y);
    	
        assertEquals(expected,actual);
	
		
	
}
}
