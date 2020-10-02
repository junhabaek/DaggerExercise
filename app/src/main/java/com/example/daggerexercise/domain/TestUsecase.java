package com.example.daggerexercise.domain;

import com.example.daggerexercise.data.SomeData;

import javax.inject.Inject;

public class TestUsecase extends Usecase<Integer, SomeData> {
    ITestService mTestService;

    @Inject
    public TestUsecase(TestService mTestService) {
        this.mTestService = mTestService;
    }

    @Override
    protected SomeData buildUsecase(Integer a) {
        return mTestService.getData(a);
    }
}
