package org.sourceit;

import org.testng.Assert;
import org.testng.annotations.Test;
//pp
public class HomeTaskTest2 {
//qwe23232
    @Test
    public void testDecimalToBinary1() {
        Assert.assertEquals(HomeTask2.decimalToBinary(2), 10L);
    }

    @Test
    public void testDecimalToBinary2() {
        Assert.assertEquals(HomeTask2.decimalToBinary(100), 1100100L);
    }

    @Test
    public void testDecimalToOctal1() {
        Assert.assertEquals(HomeTask2.decimalToOctal(2), 2);
    }

    @Test
    public void testDecimalToOctal2() {
        Assert.assertEquals(HomeTask2.decimalToOctal(100), 144);
    }

    @Test
    public void testDecimalToHex1() {
        Assert.assertEquals(HomeTask2.decimalToHex(2), 2);
    }

    @Test
    public void testDecimalToHex2() {
        Assert.assertEquals(HomeTask2.decimalToHex(100), 64);
    }

    @Test
    public void testBinaryToDecimal1() {
        Assert.assertEquals(HomeTask2.binaryToDecimal(10), 2);
    }

    @Test
    public void testBinaryToDecimal2() {
        Assert.assertEquals(HomeTask2.binaryToDecimal(1100100L), 100);
    }

    @Test
    public void testOctalToDecimal1() {
        Assert.assertEquals(HomeTask2.octalToDecimal(2), 2);
    }

    @Test
    public void testOctalToDecimal2() {
        Assert.assertEquals(HomeTask2.octalToDecimal(144), 100);
    }

    @Test
    public void testHexToDecimal1() {
        Assert.assertEquals(HomeTask2.hexToDecimal(2), 2);
    }

    @Test
    public void testHexToDecimal2() {
        Assert.assertEquals(HomeTask2.hexToDecimal(64), 100);
    }

    @Test
    public void testGenerateTwoDimensionArray() {
        int i = 4;
        int j = 5;
        int[][] array = HomeTask2.generateTwoDimensionArray(i, j);
        for (i = 0; i < array.length; i++) {
            Assert.assertEquals(array[i].length, j);
        }
    }

    @Test
    public void testFindMaxProduct1() {
        int[][] array = {
                {1, 2, 3, 4},
                {1, 3, 6, 7},
                {5, 6, 7, 9},
                {10, 5, 3, 4}

        };
        Assert.assertEquals(HomeTask2.findMaxProduct(array), 3);
    }

    @Test
    public void testFindMaxProduct2() {
        int[][] array = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {10, 4, 0, 4},
                {0, 1, 3, 4}

        };
        Assert.assertEquals(HomeTask2.findMaxProduct(array), 0);
    }

    @Test
    public void testGetSimple1() {
        int[] simple = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        Assert.assertEquals(HomeTask2.getSimple(30), simple);
    }

    @Test
    public void testGetSimple2() {
        int[] simple = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        Assert.assertEquals(HomeTask2.getSimple(100), simple);
    }

    @Test
    public void testSum1() {
        Assert.assertEquals(HomeTask2.sum(2), 3);
    }

    @Test
    public void testSum2() {
        Assert.assertEquals(HomeTask2.sum(20), 210);
    }

    @Test
    public void testSum3() {
        Assert.assertEquals(HomeTask2.sum(-1), 0);
    }

    @Test
    public void testProduct1() {
        Assert.assertEquals(HomeTask2.product(2, 4), 8);
    }

    @Test
    public void testProduct2() {
        Assert.assertEquals(HomeTask2.product(-2, 4), -8);
    }

    @Test
    public void testProduct3() {
        Assert.assertEquals(HomeTask2.product(-2, -4), 8);
    }

}
