package com.tts.TransitApp.model;

import lombok.Data;

//needed for deserialization in the getDistance method
@Data
public class Element {
    public Distance distance;
    public Duration duration;
    public String status;
}
