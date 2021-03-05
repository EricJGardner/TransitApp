package com.tts.TransitApp.model;

import lombok.Data;

//class needed for deserialization in the getCoordinates method
@Data
public class Geometry {
    public Location location;
}
