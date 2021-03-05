package com.tts.TransitApp.model;

import lombok.Data;

//needed for deserialization in the getDistance method
@Data
public class Duration {
    public String text;
    public int value;
}
