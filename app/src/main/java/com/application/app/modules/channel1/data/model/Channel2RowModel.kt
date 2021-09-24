package com.application.app.modules.channel1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Channel2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtKTv: String? = MyApp.getInstance().resources.getString(R.string.lbl_k_tv)

)
