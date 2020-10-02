package com.example.daggerexercise.presentation;

import com.example.daggerexercise.data.SomeData;

public interface TestContract {
    interface View{
        void showResult(SomeData data);
    }
    interface Presenter{
        void requestSomething(Integer a);
        void setView(TestContract.View tv);
    }
}
