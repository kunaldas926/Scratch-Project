package com.application.app.modules.seemore5.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.seemore5.`data`.model.SeeMore5Model
import com.application.app.modules.seemore5.`data`.model.SeeMore6RowModel
import kotlin.collections.MutableList

public class SeeMore5VM : ViewModel() {
  public val seeMore5Model: MutableLiveData<SeeMore5Model> = MutableLiveData(SeeMore5Model())

  public val recyclerViewList: MutableLiveData<MutableList<SeeMore6RowModel>> =
      MutableLiveData(mutableListOf())
}
