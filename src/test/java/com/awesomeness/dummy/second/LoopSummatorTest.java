package com.awesomeness.dummy.second;

import com.awesomeness.dummy.second.LoopSummator;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoopSummatorTest {

    private LoopSummator loopSummator;

    @Before
    public void setUp() throws Exception {
        loopSummator = new LoopSummator();
    }

    @Test
    public void shouldAdd() throws Exception {
        //given
        int startRange = 3;
        int stopRange = 50;

        //when
        Integer result = loopSummator.add(startRange, stopRange);

        //then
        assertThat(result).isNotNull().isEqualTo(1134);

    }

}