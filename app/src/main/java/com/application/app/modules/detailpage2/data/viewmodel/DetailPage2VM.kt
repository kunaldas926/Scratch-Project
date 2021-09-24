package com.application.app.modules.detailpage2.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.detailpage2.`data`.model.DetailPage2Model
import com.application.app.modules.detailpage2.`data`.model.DetailPage3RowModel
import kotlin.collections.MutableList

public class DetailPage2VM : ViewModel() {
  public val detailPage2Model: MutableLiveData<DetailPage2Model> =
      MutableLiveData(DetailPage2Model())

  public val recyclerViewList: MutableLiveData<MutableList<DetailPage3RowModel>> =
      MutableLiveData(mutableListOf())
}
