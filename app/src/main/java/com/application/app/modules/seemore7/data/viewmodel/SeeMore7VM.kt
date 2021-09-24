package com.application.app.modules.seemore7.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.seemore7.`data`.model.SeeMore7Model
import com.application.app.modules.seemore7.`data`.model.SeeMore8RowModel
import kotlin.collections.MutableList

public class SeeMore7VM : ViewModel() {
  public val seeMore7Model: MutableLiveData<SeeMore7Model> = MutableLiveData(SeeMore7Model())

  public val recyclerViewList: MutableLiveData<MutableList<SeeMore8RowModel>> =
      MutableLiveData(mutableListOf())
}
