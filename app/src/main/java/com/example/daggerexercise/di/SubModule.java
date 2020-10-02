package com.example.daggerexercise.di;

import com.example.daggerexercise.data.TestLocal;
import com.example.daggerexercise.data.TestRemote;
import com.example.daggerexercise.data.TestRepository;
import com.example.daggerexercise.domain.ITestService;
import com.example.daggerexercise.domain.TestDataSource;
import com.example.daggerexercise.domain.TestService;
import com.example.daggerexercise.domain.TestUsecase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SubModule {

    @Provides
    TestUsecase provideTestUsecase(TestService testService){
        return new TestUsecase(testService);
    }

    @Provides
    TestService provideTestService(TestRepository repository){
        return new TestService(repository);
    }

    @Singleton
    @Provides
    TestRepository provideTestRepository(TestRemote tm, TestLocal tl){
        return new TestRepository(tm, tl);
    }

    @Provides
    TestRemote providesTestRemote(){
        return new TestRemote();
    }

    @Provides
    TestLocal providesTestLocal(){
        return new TestLocal();
    }
}
