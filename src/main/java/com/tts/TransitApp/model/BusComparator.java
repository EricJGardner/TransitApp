package com.tts.TransitApp.model;

import lombok.Data;

import java.util.Comparator;
//Since Bus is an object we created, we need to provide a comparator so
// that Java knows how to compare one Bus to another during the sorting process.
@Data
public class BusComparator implements Comparator<Bus> {
    @Override
    public int compare(Bus o1, Bus o2) {
        if (o1.distance < o2.distance) return -1;
        if (o1.distance > o2.distance) return 1;
        return 0;
    }
}
