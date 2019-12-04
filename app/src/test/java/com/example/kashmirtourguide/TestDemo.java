package com.example.kashmirtourguide;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestDemo {
    Test t=new Test();

    @org.junit.Test
    public void  match()
    {
        assertEquals("umar","umar");
    }
    @org.junit.Test
    public void summ()
    {
        int x=t.sum(10,20);
        assertEquals(x,30);

    }
}
