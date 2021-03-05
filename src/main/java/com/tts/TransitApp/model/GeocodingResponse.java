package com.tts.TransitApp.model;

import lombok.Data;

import java.util.List;

//class needed for deserialization in the getCoordinates method
@Data
public class GeocodingResponse {
    public List<Geocoding> results;
}
