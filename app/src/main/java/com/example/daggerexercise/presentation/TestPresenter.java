package com.example.daggerexercise.presentation;

import com.example.daggerexercise.domain.TestUsecase;

import javax.inject.Inject;

public class TestPresenter implements TestContract.Presenter {
    TestContract.View testView;
    TestUsecase testUsecase;

    public TestPresenter(TestUsecase tu) {
        this.testUsecase = tu;
    }

    @Override
    public void requestSomething(Integer a) {
        testUsecase.execute(a, (response)->{testView.showResult(response);},
                (response)->{});
    }

    public void setView(TestContract.View tv){
        testView = tv;
    }
}
