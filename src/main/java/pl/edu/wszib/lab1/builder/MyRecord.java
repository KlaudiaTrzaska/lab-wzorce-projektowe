package pl.edu.wszib.lab1.builder;

import com.google.auto.value.AutoBuilder;

public record MyRecord(String testVar) {




    @AutoBuilder
    interface Builder {

    }
}
