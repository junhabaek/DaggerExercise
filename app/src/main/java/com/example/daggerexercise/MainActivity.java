package com.example.daggerexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerexercise.data.SomeData;
import com.example.daggerexercise.di.DaggerMainComponent;
import com.example.daggerexercise.di.MainComponent;
import com.example.daggerexercise.presentation.TestContract;
import com.example.daggerexercise.presentation.TestPresenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements TestContract.View {

    @Inject
    TestPresenter testPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.create().inject(this);
        testPresenter.setView(this);
        testPresenter.requestSomething(3);
    }

    @Override
    public void showResult(SomeData data) {
        System.out.println(data.str);
    }
}