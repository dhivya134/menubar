package com.example.menubar.ui.aboutme;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutMeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AboutMeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Aboutme Page");
    }

    public LiveData<String> getText() {
        return mText;
    }
}