package com.application.app.modules.detailpage6.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.detailpage6.`data`.model.DetailPage6Model
import com.application.app.modules.detailpage6.`data`.model.DetailPage7RowModel
import kotlin.collections.MutableList

public class DetailPage6VM : ViewModel() {
  public val detailPage6Model: MutableLiveData<DetailPage6Model> =
      MutableLiveData(DetailPage6Model())

  public val recyclerViewList: MutableLiveData<MutableList<DetailPage7RowModel>> =
      MutableLiveData(mutableListOf())
}
