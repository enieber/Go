package com.example.enieber.go.dagger;


import com.example.enieber.go.dagger.module.ApplicationModule;
import com.example.enieber.go.dagger.module.DbModule;
import com.example.enieber.go.dagger.module.NetworkModule;
import com.example.enieber.go.dagger.module.RepositoryModule;
import com.example.enieber.go.dagger.module.ServiceModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        NetworkModule.class,
        ServiceModule.class,
        RepositoryModule.class,
        DbModule.class
})
public interface DiComponent {
    void inject(MainActivity activity);

    void inject(CityListFragment fragment);

    void inject(CityForecastFragment fragment);

    void inject(CityAddDialogFragment fragment);
}
