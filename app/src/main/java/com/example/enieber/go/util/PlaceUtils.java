package com.example.enieber.go.util;

import okhttp3.Address;

public final class PlaceUtils {

    private PlaceUtils() {
    }

    public static String getCityDescription(Address address) {
        String description = address.getLocality();
        if (address.getAdminArea() != null) {
            description += ", " + address.getAdminArea();
        }

        if (address.getCountryName() != null) {
            description += ", " + address.getCountryName();
        }
        return description;
    }

}