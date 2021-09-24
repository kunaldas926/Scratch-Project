package com.application.app.modules.seemore1.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.seemore1.`data`.model.SeeMore1Model
import com.application.app.modules.seemore1.`data`.model.SeeMore2RowModel
import kotlin.collections.MutableList

public class SeeMore1VM : ViewModel() {
  public val seeMore1Model: MutableLiveData<SeeMore1Model> = MutableLiveData(SeeMore1Model())

  public val recyclerViewList: MutableLiveData<MutableList<SeeMore2RowModel>> =
      MutableLiveData(mutableListOf())
}
