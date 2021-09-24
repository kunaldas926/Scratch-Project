package com.application.app.modules.channel1.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.channel1.`data`.model.Channel1Model
import com.application.app.modules.channel1.`data`.model.Channel2RowModel
import kotlin.collections.MutableList

public class Channel1VM : ViewModel() {
  public val channel1Model: MutableLiveData<Channel1Model> = MutableLiveData(Channel1Model())

  public val recyclerViewList: MutableLiveData<MutableList<Channel2RowModel>> =
      MutableLiveData(mutableListOf())
}
