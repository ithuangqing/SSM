package com.ithuangqing.spring.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {

    @Test
    public void toAdd() {

        Assert.assertEquals(10,new Add().toAdd(6,6));

    }
}