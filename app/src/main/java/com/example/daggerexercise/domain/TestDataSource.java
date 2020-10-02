package com.example.daggerexercise.domain;

import com.example.daggerexercise.data.SomeData;

public interface TestDataSource {
    SomeData getData(Integer a);
}
