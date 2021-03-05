package com.tts.TransitApp.model;

import lombok.Data;

//BusRequest will be used on front end form, acts as request object for
//GetNearbyBuses method which ties all of our API together to do something useful
@Data
public class BusRequest {
    public String address;
    public String city;
}
