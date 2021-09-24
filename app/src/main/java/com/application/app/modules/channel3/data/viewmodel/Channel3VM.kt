package com.application.app.modules.channel3.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.channel3.`data`.model.Channel3Model
import com.application.app.modules.channel3.`data`.model.Channel4RowModel
import kotlin.collections.MutableList

public class Channel3VM : ViewModel() {
  public val channel3Model: MutableLiveData<Channel3Model> = MutableLiveData(Channel3Model())

  public val recyclerViewList: MutableLiveData<MutableList<Channel4RowModel>> =
      MutableLiveData(mutableListOf())
}
