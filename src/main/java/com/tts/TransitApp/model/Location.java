package com.tts.TransitApp.model;

import lombok.Data;

//class needed for deserialization in the getCoordinates method
@Data
public class Location {
    public String lat;
    public String lng;
}
