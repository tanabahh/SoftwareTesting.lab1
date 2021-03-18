package com.company.test;

import com.company.part2.BTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BTreeTest {

    private BTree smallBtree;
    private BTree b;
    private  ArrayList<Integer> expected;
    private ArrayList<Integer> actual;

    @BeforeEach
    void setUp() {
        smallBtree = new BTree(4);
        int[] smallMass = {1, 2, 3};
        smallBtree.init(smallMass);
        b = new BTree(4);
        int[] mass = {8, 9, 10, 11, 15, 20};
        b.init(mass);

    }

    @Test
    void insert() {
        smallBtree.insert(4);
        expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        actual = new ArrayList<>();
        smallBtree.show(actual);
        assertEquals(expected, actual);

        b.insert(17);
        expected.clear();
        expected.addAll(Arrays.asList(8, 9, 10, 11, 15, 17, 20));
        actual.clear();
        b.show(actual);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void remove() {
        smallBtree.remove(3);
        expected = new ArrayList<>(Arrays.asList(1, 2));
        actual = new ArrayList<>();
        smallBtree.show(actual);
        Assertions.assertEquals(expected, actual);

        b.remove(10);
        expected.clear();
        expected.addAll(Arrays.asList(8, 9, 11, 15, 20));
        actual.clear();
        b.show(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void find() {
        Assertions.assertEquals(2, smallBtree.find(3));
        Assertions.assertEquals(2, b.find(10));
    }
}