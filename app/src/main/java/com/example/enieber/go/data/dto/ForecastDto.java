package com.example.enieber.go.data.dto;

import com.example.enieber.go.model.go.Currently;
import com.example.enieber.go.model.go.Daily;

import java.io.Serializable;

public class ForecastDto implements Serializable {

    public double latitude;
    public double longitude;
    public String timezone;
    public Integer offset;
    public Currently currently;
    public Daily daily;

}
