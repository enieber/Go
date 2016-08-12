package com.example.enieber.go.data.repository.impl;

import android.content.Context;

import com.example.enieber.go.R;
import com.example.enieber.go.data.dto.ForecastDto;
import com.example.enieber.go.data.repository.ForecastRepository;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

@Singleton
public class ForecastRepositoryImpl implements ForecastRepository {

    private ForecastService service;
    private Context context;

    @Inject
    public ForecastRepositoryImpl(ForecastService service, Context context) {
        this.service = service;
        this.context = context;
    }

    @Override
    public Observable<ForecastDto> getForecast(double latitude, double longitude) {
        Observable<ForecastDto> forecast = service
                .getForecast(context.getString(R.string.FORECAST_API_KEY),
                        latitude,
                        longitude);

        return forecast.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}