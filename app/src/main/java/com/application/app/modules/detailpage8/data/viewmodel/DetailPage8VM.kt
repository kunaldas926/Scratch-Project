package com.application.app.modules.detailpage8.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.detailpage8.`data`.model.DetailPage8Model
import com.application.app.modules.detailpage8.`data`.model.DetailPage9RowModel
import kotlin.collections.MutableList

public class DetailPage8VM : ViewModel() {
  public val detailPage8Model: MutableLiveData<DetailPage8Model> =
      MutableLiveData(DetailPage8Model())

  public val recyclerViewList: MutableLiveData<MutableList<DetailPage9RowModel>> =
      MutableLiveData(mutableListOf())
}
