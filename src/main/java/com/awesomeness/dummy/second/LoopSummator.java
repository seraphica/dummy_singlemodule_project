package com.awesomeness.dummy.second;

class LoopSummator {

    Integer add(Integer startRange, Integer stopRange) {
        Integer sum = 0;
        for (int i = startRange; i <= stopRange; i++) {
            sum += i;
            if (sum > 10) {
                sum -= 3;
            }
        }
        return sum;
    }
}
