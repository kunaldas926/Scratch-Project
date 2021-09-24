package com.application.app.modules.explore8.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.explore8.`data`.model.Explore10RowModel
import com.application.app.modules.explore8.`data`.model.Explore8Model
import com.application.app.modules.explore8.`data`.model.Explore9RowModel
import kotlin.collections.MutableList

public class Explore8VM : ViewModel() {
  public val explore8Model: MutableLiveData<Explore8Model> = MutableLiveData(Explore8Model())

  public val recyclerViewList: MutableLiveData<MutableList<Explore9RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView1List: MutableLiveData<MutableList<Explore10RowModel>> =
      MutableLiveData(mutableListOf())
}
