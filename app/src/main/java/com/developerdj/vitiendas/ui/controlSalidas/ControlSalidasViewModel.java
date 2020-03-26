package com.developerdj.vitiendas.ui.controlSalidas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ControlSalidasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ControlSalidasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}