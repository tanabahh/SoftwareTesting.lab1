package com.company.test;

import com.company.part1.Taylor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TaylorTest {

    private Taylor taylor;
    private double del;
    private double delForThird;

    @BeforeEach
    void setUp() {
        taylor = new Taylor(7);
        del = 0.001;
        delForThird = 0.01;
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1.0",
            "1.5707963267948966, 0.0",
            "3.141592653589793, -1.0",
            "-1.5707963267948966, 0.0"
    })
    public void boundaryCos(double actual, double expected) {
        assertEquals(expected, taylor.cos(actual), del);
    }

    @ParameterizedTest
    @CsvSource({
            "0.5, 1.0471975511965976",
            "0.7071067811865476, 0.7853981633974483",
            "0.8660254037844386, 0.5235987755982988"
    })
    public void firstQuarterCos(double expected, double actual) {
        Assertions.assertEquals(expected, taylor.cos(actual), del);
    }

    @ParameterizedTest
    @CsvSource({
            "-0.5, 2.0943951023931953",
            "-0.7071067811865476, 2.356194490192345",
            "-0.8660254037844386, 2.6179938779914944"
    })
    public void secondQuarterCos(double expected, double actual) {
        Assertions.assertEquals(expected, taylor.cos(actual), del);
    }

    @ParameterizedTest
    @CsvSource({
            "-0.5, 4.1887902047863905",
            "-0.7071067811865476, 3.9269908169872414",
            "-0.8660254037844386, 3.665191429188092"
    })
    public void thirdQuarterCos(double expected, double actual){
        Assertions.assertEquals(expected, taylor.cos(actual), delForThird);
    }

    @ParameterizedTest
    @CsvSource({
            "0.5, -1.0471975511965976",
            "0.7071067811865476, -0.7853981633974483",
            "0.8660254037844386, -0.5235987755982988"
    })
    public void forthQuarterCos(double expected, double actual){
        Assertions.assertEquals(expected, taylor.cos(actual), del);
    }
}