package com.example.rajeev.architecturecomponentexample.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.rajeev.architecturecomponentexample.database.AppRepository;
import com.example.rajeev.architecturecomponentexample.database.NoteEntity;
import com.example.rajeev.architecturecomponentexample.utilities.SampleData;

import java.util.List;

public class MainViewModel extends AndroidViewModel {

    private AppRepository mRepository;
    public LiveData<List<NoteEntity>> mNotes;

    public MainViewModel(@NonNull Application application) {
        super(application);

        mRepository = AppRepository.getInstance(application.getApplicationContext());
        mNotes = mRepository.mNotes;
    }


    public void addSampleData() {
        mRepository.addSampleData();
    }

    public void deleteAllNotes() {
        mRepository.deleteAllNotes();
    }
}
