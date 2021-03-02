package com.company.part1;

import com.company.part1.Taylor;
import org.junit.Assert;
import org.junit.Test;

public class TaylorTest {

    @Test
    public void boundaryCos() {
        Taylor taylor = new Taylor(7);
        Assert.assertEquals(1.0, taylor.cos(0), 0.001);
        Assert.assertEquals(0.0, taylor.cos(Math.PI/2), 0.001);
        Assert.assertEquals(-1.0, taylor.cos(Math.PI), 0.001);
        Assert.assertEquals(0.0, taylor.cos(-Math.PI/2), 0.001);
    }

    @Test
    public void firstQuarterCos() {
        Taylor taylor = new Taylor(7);
        Assert.assertEquals(0.5, taylor.cos(Math.PI/3), 0.001);
        Assert.assertEquals(Math.sqrt(2)/2, taylor.cos(Math.PI/4), 0.001);
        Assert.assertEquals(Math.sqrt(3)/2, taylor.cos(Math.PI/6), 0.001);
    }

    @Test
    public void secondQuarterCos(){
        Taylor taylor = new Taylor(7);
        Assert.assertEquals(- 0.5, taylor.cos(2 * Math.PI/3), 0.001);
        Assert.assertEquals(- Math.sqrt(2)/2, taylor.cos(3 * Math.PI/4), 0.001);
        Assert.assertEquals(- Math.sqrt(3)/2, taylor.cos(5 * Math.PI/6), 0.001);
    }

    @Test
    public void thirdQuarterCos(){
        Taylor taylor = new Taylor(7);
        Assert.assertEquals(-0.5, taylor.cos(4 * Math.PI/3), 0.01);
        Assert.assertEquals(-Math.sqrt(2)/2, taylor.cos(5 * Math.PI/4), 0.01);
        Assert.assertEquals(-Math.sqrt(3)/2, taylor.cos(7 * Math.PI/6), 0.01);
    }

    @Test
    public void forthQuarterCos(){
        Taylor taylor = new Taylor(7);
        Assert.assertEquals(0.5, taylor.cos(-Math.PI/3), 0.001);
        Assert.assertEquals(Math.sqrt(2)/2, taylor.cos(-Math.PI/4), 0.001);
        Assert.assertEquals(Math.sqrt(3)/2, taylor.cos(-Math.PI/6), 0.001);
    }
}