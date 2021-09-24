package com.application.app.modules.search3.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.search3.`data`.model.Search3Model
import com.application.app.modules.search3.`data`.model.Search4RowModel
import com.application.app.modules.search3.`data`.model.Search5RowModel
import com.application.app.modules.search3.`data`.model.Search6RowModel
import kotlin.collections.MutableList

public class Search3VM : ViewModel() {
  public val search3Model: MutableLiveData<Search3Model> = MutableLiveData(Search3Model())

  public val recyclerViewList: MutableLiveData<MutableList<Search4RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView1List: MutableLiveData<MutableList<Search5RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView2List: MutableLiveData<MutableList<Search6RowModel>> =
      MutableLiveData(mutableListOf())
}
