package com.awesomeness.dummy.first;

import com.awesomeness.dummy.first.SubtractCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SubtractCalculatorTest {

    private SubtractCalculator subtractCalculator;

    @Before
    public void setUp() throws Exception {
        subtractCalculator = new SubtractCalculator();

    }

    @Test
    public void shouldSubstract() throws Exception {
        //given
        int firstValue = 1;
        int secondValue = -7;

        //when
        Integer result = subtractCalculator.subtract(firstValue, secondValue);

        //then
        assertThat(result).isNotNull().isEqualTo(8);

    }

}