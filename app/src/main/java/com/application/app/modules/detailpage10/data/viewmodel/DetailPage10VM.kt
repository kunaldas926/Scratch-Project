package com.application.app.modules.detailpage10.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.detailpage10.`data`.model.DetailPage10Model
import com.application.app.modules.detailpage10.`data`.model.DetailPage11RowModel
import kotlin.collections.MutableList

public class DetailPage10VM : ViewModel() {
  public val detailPage10Model: MutableLiveData<DetailPage10Model> =
      MutableLiveData(DetailPage10Model())

  public val recyclerViewList: MutableLiveData<MutableList<DetailPage11RowModel>> =
      MutableLiveData(mutableListOf())
}
