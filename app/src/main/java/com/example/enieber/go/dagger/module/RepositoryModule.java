package com.example.enieber.go.dagger.module;

import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by enieer on 11/08/16.
 */
@Module
public class RepositoryModule {

    @Provides
    CityRepository provideCityRepository(Context context, @Named("CityDao") RuntimeExceptionDao<City, Integer> cityDao) {
        return new CityRepositoryImpl(context, cityDao);
    }

    @Provides
    ForecastRepository provideForecastRepository(ForecastService service, Context context) {
        return new ForecastRepositoryImpl(service, context);
    }

}
