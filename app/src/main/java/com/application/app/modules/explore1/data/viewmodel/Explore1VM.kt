package com.application.app.modules.explore1.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.explore1.`data`.model.Explore1Model
import com.application.app.modules.explore1.`data`.model.Explore2RowModel
import com.application.app.modules.explore1.`data`.model.Explore3RowModel
import kotlin.collections.MutableList

public class Explore1VM : ViewModel() {
  public val explore1Model: MutableLiveData<Explore1Model> = MutableLiveData(Explore1Model())

  public val recyclerViewList: MutableLiveData<MutableList<Explore2RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView1List: MutableLiveData<MutableList<Explore3RowModel>> =
      MutableLiveData(mutableListOf())
}
