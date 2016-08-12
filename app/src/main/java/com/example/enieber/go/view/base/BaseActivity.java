package com.example.enieber.go.view.base;

import android.support.v7.app.AppCompatActivity;

import com.example.enieber.go.MainApplication;
import com.example.enieber.go.dagger.DiComponent;

public abstract class BaseActivity extends AppCompatActivity {

    private MainApplication getMainApplication() {
        return (MainApplication) getApplication();
    }

    protected DiComponent getDiComponent() {
        return getMainApplication().getDiComponent();
    }

}