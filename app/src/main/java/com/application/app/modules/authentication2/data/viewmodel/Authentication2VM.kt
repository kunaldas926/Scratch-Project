package com.application.app.modules.authentication2.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.authentication2.`data`.model.Authentication2Model

public class Authentication2VM : ViewModel() {
  public val authentication2Model: MutableLiveData<Authentication2Model> =
      MutableLiveData(Authentication2Model())
}
