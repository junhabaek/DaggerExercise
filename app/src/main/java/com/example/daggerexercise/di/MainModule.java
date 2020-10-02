package com.example.daggerexercise.di;

import com.example.daggerexercise.MainActivity;
import com.example.daggerexercise.domain.TestUsecase;
import com.example.daggerexercise.presentation.TestContract;
import com.example.daggerexercise.presentation.TestPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    TestPresenter provideTestPresenter(TestUsecase tu){
        TestPresenter presenter = new TestPresenter(tu);
        return presenter;
    }
}
