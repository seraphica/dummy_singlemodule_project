package com.awesomeness.dummy;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntroductionServiceTest {

    private static final String REAL_NAME = "this is awesome app";
    private static final String FALSE_NAME = "this is awesome app under cover";


    private IntroductionService introductionService;

    @Before
    public void setUp() throws Exception {
        introductionService = new IntroductionService();
    }

    @Test
    public void shouldGetName() throws Exception {
        //given

        //when
        String result = introductionService.getName();

        //then
        assertThat(result).isNotEmpty().isEqualTo(REAL_NAME);

    }

    @Test
    public void shouldReturnRealNameIfWanted() throws Exception {
        //given
        boolean realName = true;

        //when
        String result = introductionService.getName(realName);

        //then
        assertThat(result).isNotNull().isEqualTo(REAL_NAME);

    }

    @Test
    public void shouldReturnFalseNameIfRealNotWanted() throws Exception {
        //given
        boolean realName = false;

        //when
        String result = introductionService.getName(realName);

        //then
        assertThat(result).isNotNull().isEqualTo(FALSE_NAME);

    }
}