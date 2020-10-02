package com.example.daggerexercise.domain;

import com.example.daggerexercise.data.SomeData;

import javax.inject.Inject;

public class TestService implements ITestService {

    TestDataSource mTestDataSource;

    @Inject
    public TestService(TestDataSource mTestDataSource) {
        this.mTestDataSource = mTestDataSource;
    }

    @Override
    public SomeData getData(Integer a) {
        return mTestDataSource.getData(a);
    }
}
