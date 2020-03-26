package com.developerdj.vitiendas.ui.admPreVentas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AdminPreventasViewModel extends ViewModel {

    private MutableLiveData<String> mUrl;

    public AdminPreventasViewModel() {
        mUrl = new MutableLiveData<>();
        mUrl.setValue("https://image.shutterstock.com/image-vector/abstract-business-logo-icon-design-260nw-323935205.jpg");
    }

    public LiveData<String> getText() {
        return mUrl;
    }
}
