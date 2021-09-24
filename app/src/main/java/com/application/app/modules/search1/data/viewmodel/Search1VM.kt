package com.application.app.modules.search1.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.search1.`data`.model.Search1Model
import com.application.app.modules.search1.`data`.model.Search2RowModel
import kotlin.collections.MutableList

public class Search1VM : ViewModel() {
  public val search1Model: MutableLiveData<Search1Model> = MutableLiveData(Search1Model())

  public val recyclerViewList: MutableLiveData<MutableList<Search2RowModel>> =
      MutableLiveData(mutableListOf())
}
