package com.awesomeness.dummy.first;

import com.awesomeness.dummy.first.Multiplier;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplierTest {

    private Multiplier multiplier;

    @Before
    public void setUp() throws Exception {
        multiplier = new Multiplier();
    }

    @Test
    public void shouldMultiply() throws Exception {
        //given
        int firstValue = 113;
        int secondValue = 32;

        //when
        Integer result = multiplier.multiply(firstValue, secondValue);

        //then
        assertThat(result).isNotNull().isEqualTo(3616);

    }

}