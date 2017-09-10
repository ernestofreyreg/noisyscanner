package com.codexsw.noisy;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Device {
    @JsonProperty("address") String address;
    @JsonProperty("scannerid") String scannerid;
    @JsonProperty("type") String type;

    Device() {}

    Device(String address, String scannerid) {
        this.address = address;
        this.scannerid = scannerid;
        this.type = "detect";
    }

    @Override
    public String toString() {
        return "Device{type='" + type + "', address='" + address + "', scannerid='" + scannerid + "'}";
    }
}
