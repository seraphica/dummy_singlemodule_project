package com.awesomeness.dummy;

class IntroductionService {

    private static final String REAL_NAME = "this is awesome app";
    private static final String FALSE_NAME = "this is awesome app under cover";

    String getName() {
        return REAL_NAME;
    }

    String getName(boolean real) {
        if (real) {
            return REAL_NAME;
        }
        return FALSE_NAME;
    }
}
