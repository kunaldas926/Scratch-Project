package com.application.app.modules.account4.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.account4.`data`.model.Account4Model
import com.application.app.modules.account4.`data`.model.Account5RowModel
import kotlin.collections.MutableList

public class Account4VM : ViewModel() {
  public val account4Model: MutableLiveData<Account4Model> = MutableLiveData(Account4Model())

  public val recyclerViewList: MutableLiveData<MutableList<Account5RowModel>> =
      MutableLiveData(mutableListOf())
}
