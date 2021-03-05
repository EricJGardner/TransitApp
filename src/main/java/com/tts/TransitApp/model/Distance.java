package com.tts.TransitApp.model;

import lombok.Data;

//needed for deserialization in the getDistance method
@Data
public class Distance {
    public String text;
    public int value;
}
