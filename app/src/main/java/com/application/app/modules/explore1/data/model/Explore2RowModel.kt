package com.application.app.modules.explore1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtIo: String? = MyApp.getInstance().resources.getString(R.string.lbl_io)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNoChristmasFo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_christmas_fo)

)
