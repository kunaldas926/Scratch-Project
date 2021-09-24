package com.application.app.modules.explore1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore3RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTurnerHooch: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_turner_hooch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSubTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_sub_title)

)
