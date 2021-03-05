package com.tts.TransitApp.model;

import lombok.Data;

import java.util.List;

//needed for deserialization in the getDistance method
@Data
public class DistanceResponse {
    public List<Row> rows;
}
