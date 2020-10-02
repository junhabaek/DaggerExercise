package com.example.daggerexercise.data;

import com.example.daggerexercise.domain.TestDataSource;

import javax.inject.Inject;

public class TestRepository implements TestDataSource {
    TestRemote testRemote;
    TestLocal testLocal;

    @Inject
    public TestRepository(TestRemote testRemote, TestLocal testLocal) {
        this.testRemote = testRemote;
        this.testLocal = testLocal;
    }

    @Override
    public SomeData getData(Integer a) {
        return testRemote.getData(a);
    }
}
