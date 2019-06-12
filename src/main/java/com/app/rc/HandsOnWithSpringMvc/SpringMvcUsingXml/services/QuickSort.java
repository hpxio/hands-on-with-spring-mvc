package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingXml.services;

import com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingXml.models.ISortAlgorithms;

public class QuickSort implements ISortAlgorithms {

    @Override
    public void sort() {
        System.out.println("This is Quick Sort...");
    }
}