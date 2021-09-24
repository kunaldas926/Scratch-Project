package com.application.app.modules.search10.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.search10.`data`.model.Search10Model
import com.application.app.modules.search10.`data`.model.Search11RowModel
import kotlin.collections.MutableList

public class Search10VM : ViewModel() {
  public val search10Model: MutableLiveData<Search10Model> = MutableLiveData(Search10Model())

  public val recyclerViewList: MutableLiveData<MutableList<Search11RowModel>> =
      MutableLiveData(mutableListOf())
}
