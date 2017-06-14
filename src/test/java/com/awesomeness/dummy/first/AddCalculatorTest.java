package com.awesomeness.dummy.first;

import com.awesomeness.dummy.first.AddCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddCalculatorTest {

    private AddCalculator addCalculator;

    @Before
    public void setUp() throws Exception {
        addCalculator = new AddCalculator();
    }

    @Test
    public void shouldAdd() throws Exception {
        //given
        int firstValue = 2;
        int secondValue = 1;

        //when
        Integer result = addCalculator.add(firstValue, secondValue);

        //then
        assertThat(result).isNotNull().isNotNegative().isEqualTo(3);

    }

}