package com.eyousefi.service.impl;

import com.eyousefi.service.LocationService;

public class LocationServiceBuilder {

    public LocationService build() {
        return new DefaultLocationService();
    }
}
