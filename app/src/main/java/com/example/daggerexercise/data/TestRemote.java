package com.example.daggerexercise.data;

import com.example.daggerexercise.domain.TestDataSource;

public class TestRemote implements TestDataSource {
    @Override
    public SomeData getData(Integer a) {
        SomeData someData = new SomeData();
        someData.str = String.valueOf(a);
        return someData;
    }
}
