package com.application.app.modules.explore11.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.explore11.`data`.model.Explore11Model
import com.application.app.modules.explore11.`data`.model.Explore12RowModel
import com.application.app.modules.explore11.`data`.model.Explore13RowModel
import com.application.app.modules.explore11.`data`.model.Explore14RowModel
import kotlin.collections.MutableList

public class Explore11VM : ViewModel() {
  public val explore11Model: MutableLiveData<Explore11Model> = MutableLiveData(Explore11Model())

  public val recyclerViewList: MutableLiveData<MutableList<Explore12RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView1List: MutableLiveData<MutableList<Explore13RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView2List: MutableLiveData<MutableList<Explore14RowModel>> =
      MutableLiveData(mutableListOf())
}
