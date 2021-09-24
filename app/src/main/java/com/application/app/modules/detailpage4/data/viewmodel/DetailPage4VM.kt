package com.application.app.modules.detailpage4.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.detailpage4.`data`.model.DetailPage4Model
import com.application.app.modules.detailpage4.`data`.model.DetailPage5RowModel
import kotlin.collections.MutableList

public class DetailPage4VM : ViewModel() {
  public val detailPage4Model: MutableLiveData<DetailPage4Model> =
      MutableLiveData(DetailPage4Model())

  public val recyclerViewList: MutableLiveData<MutableList<DetailPage5RowModel>> =
      MutableLiveData(mutableListOf())
}
