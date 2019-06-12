package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingXml.services;

import com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingXml.models.ISearchAlgorithms;

public class BinarySearch implements ISearchAlgorithms {

    @Override
    public void search() {
        System.out.println("This is Binary Search...");
    }

}