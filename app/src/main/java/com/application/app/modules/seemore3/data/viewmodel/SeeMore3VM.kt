package com.application.app.modules.seemore3.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.seemore3.`data`.model.SeeMore3Model
import com.application.app.modules.seemore3.`data`.model.SeeMore4RowModel
import kotlin.collections.MutableList

public class SeeMore3VM : ViewModel() {
  public val seeMore3Model: MutableLiveData<SeeMore3Model> = MutableLiveData(SeeMore3Model())

  public val recyclerViewList: MutableLiveData<MutableList<SeeMore4RowModel>> =
      MutableLiveData(mutableListOf())
}
