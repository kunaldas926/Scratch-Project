package com.application.app.modules.search7.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.search7.`data`.model.Search7Model

public class Search7VM : ViewModel() {
  public val search7Model: MutableLiveData<Search7Model> = MutableLiveData(Search7Model())
}
