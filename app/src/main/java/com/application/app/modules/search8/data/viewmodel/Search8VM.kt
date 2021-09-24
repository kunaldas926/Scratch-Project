package com.application.app.modules.search8.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.search8.`data`.model.Search8Model
import com.application.app.modules.search8.`data`.model.Search9RowModel
import kotlin.collections.MutableList

public class Search8VM : ViewModel() {
  public val search8Model: MutableLiveData<Search8Model> = MutableLiveData(Search8Model())

  public val recyclerViewList: MutableLiveData<MutableList<Search9RowModel>> =
      MutableLiveData(mutableListOf())
}
