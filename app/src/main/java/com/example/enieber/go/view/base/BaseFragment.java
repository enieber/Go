package com.example.enieber.go.view.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.example.enieber.go.MainApplication;
import com.example.enieber.go.dagger.DiComponent;

import butterknife.ButterKnife;

public class BaseFragment extends Fragment {

    private MainApplication getMainApplication() {
        return (MainApplication) getActivity().getApplication();
    }

    protected DiComponent getDiComponent() {
        return getMainApplication().getDiComponent();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }
}