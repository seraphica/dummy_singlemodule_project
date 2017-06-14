package com.awesomeness.dummy.second;

import com.awesomeness.dummy.second.Concatenator;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConcatenatorTest {

    private Concatenator concatenator;

    @Before
    public void setUp() throws Exception {
        concatenator = new Concatenator();
    }

    @Test
    public void shouldConcatenate() throws Exception {
        //given
        String firstString = "some awesome string ";
        String secondString = "more awesomeness for everyone ";

        //when
        String result = concatenator.concatenate(firstString, secondString);

        //then
        assertThat(result).isNotNull().isEqualTo("some awesome string more awesomeness for everyone ");

    }

}