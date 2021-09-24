package com.application.app.modules.explore4.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.explore4.`data`.model.Explore4Model
import com.application.app.modules.explore4.`data`.model.Explore5RowModel
import com.application.app.modules.explore4.`data`.model.Explore6RowModel
import com.application.app.modules.explore4.`data`.model.Explore7RowModel
import kotlin.collections.MutableList

public class Explore4VM : ViewModel() {
  public val explore4Model: MutableLiveData<Explore4Model> = MutableLiveData(Explore4Model())

  public val recyclerViewList: MutableLiveData<MutableList<Explore5RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView1List: MutableLiveData<MutableList<Explore6RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView2List: MutableLiveData<MutableList<Explore7RowModel>> =
      MutableLiveData(mutableListOf())
}
