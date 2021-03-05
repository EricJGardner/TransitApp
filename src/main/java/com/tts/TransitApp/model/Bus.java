package com.tts.TransitApp.model;

import lombok.Data;

@Data
public class Bus {
//public class Bus is required by the getBuses method in TransitService for
// deserialization (Serialization is the process of turning some object into
// a data format that can be restored later. Deserialization is the reverse
// of that process, taking data structured from some format, and rebuilding
// it into an object.). It has everything needed to for the bus object

    public String ADHERENCE;
    public String BLOCKID;
    public String BLOCK_ABBR;
    public String DIRECTION;
    public String LATITUDE;
    public String LONGITUDE;
    public String MSGTIME;
    public String ROUTE;
    public String STOPID;
    public String TIMEPOINT;
    public String TRIPID;
    public String VEHICLE;
    public double distance;

}
