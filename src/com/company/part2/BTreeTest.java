package com.company.part2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BTreeTest {

    @Test
    public void Insert() {
        BTree smallBtree = new BTree(4);
        smallBtree.Insert(1);
        smallBtree.Insert(4);
        smallBtree.Insert(2);
        smallBtree.Insert(3);

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> actual = new ArrayList<>();
        smallBtree.Show(actual);
        Assert.assertTrue(expected.equals(actual));

        BTree b = new BTree(4);
        b.Insert(8);
        b.Insert(9);
        b.Insert(10);
        b.Insert(11);
        b.Insert(15);
        b.Insert(20);
        b.Insert(17);

        expected.clear();
        expected.addAll(Arrays.asList(8, 9, 10, 11, 15, 17, 20));
        actual.clear();
        b.Show(actual);
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void remove() {
        BTree smallBtree = new BTree(4);
        smallBtree.Insert(1);
        smallBtree.Insert(2);
        smallBtree.Insert(4);
        smallBtree.Insert(3);

        smallBtree.Remove(3);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 4));
        ArrayList<Integer> actual = new ArrayList<>();
        smallBtree.Show(actual);
        Assert.assertTrue(expected.equals(actual));

        BTree b = new BTree(4);
        b.Insert(8);
        b.Insert(9);
        b.Insert(10);
        b.Insert(11);
        b.Insert(15);
        b.Insert(20);
        b.Insert(17);

        b.Remove(10);
        expected.clear();
        expected.addAll(Arrays.asList(8, 9, 11, 15, 17, 20));
        actual.clear();
        b.Show(actual);
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void find() {
        BTree smallBtree  = new BTree(4);
        smallBtree.Insert(4);
        smallBtree.Insert(2);
        smallBtree.Insert(1);
        smallBtree.Insert(3);

        Assert.assertEquals(2, smallBtree.Find(3));
        BTree b = new BTree(4);
        b.Insert(8);
        b.Insert(9);
        b.Insert(10);
        b.Insert(11);
        b.Insert(15);
        b.Insert(20);
        b.Insert(17);

        Assert.assertEquals(2, b.Find(10));
    }
}