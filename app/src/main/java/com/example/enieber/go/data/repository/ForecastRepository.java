package com.example.enieber.go.data.repository;

public interface ForecastRepository {

    Observable<ForecastDto> getForecast(double latitude, double longitude);

}