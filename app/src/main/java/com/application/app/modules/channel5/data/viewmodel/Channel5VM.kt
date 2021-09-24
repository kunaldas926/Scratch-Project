package com.application.app.modules.channel5.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.channel5.`data`.model.Channel5Model

public class Channel5VM : ViewModel() {
  public val channel5Model: MutableLiveData<Channel5Model> = MutableLiveData(Channel5Model())
}
