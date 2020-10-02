package com.example.daggerexercise.di;

import com.example.daggerexercise.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MainModule.class, SubModule.class})
public interface MainComponent {
    void inject(MainActivity ma);
}
