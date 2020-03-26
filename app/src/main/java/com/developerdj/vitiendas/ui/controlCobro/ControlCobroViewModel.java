package com.developerdj.vitiendas.ui.controlCobro;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ControlCobroViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ControlCobroViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}