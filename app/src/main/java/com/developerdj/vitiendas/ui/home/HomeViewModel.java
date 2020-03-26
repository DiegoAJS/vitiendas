package com.developerdj.vitiendas.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mUrl;

    public HomeViewModel() {
        mUrl = new MutableLiveData<>();
        mUrl.setValue("https://image.shutterstock.com/image-vector/abstract-business-logo-icon-design-260nw-323935205.jpg");
    }

    public LiveData<String> getText() {
        return mUrl;
    }
}