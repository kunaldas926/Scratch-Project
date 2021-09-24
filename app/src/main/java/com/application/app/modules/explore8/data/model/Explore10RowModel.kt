package com.application.app.modules.explore8.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore10RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTurnerHoock: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_turner_hoock)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAsLongWeFigh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_as_long_we_figh)

)
