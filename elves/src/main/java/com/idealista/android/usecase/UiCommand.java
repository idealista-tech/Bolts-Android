package com.idealista.android.usecase;


public interface UiCommand<VResults, TResults> {

    TResults background(VResults results);

    void ui(TResults result);

    void error(Exception error);

}
