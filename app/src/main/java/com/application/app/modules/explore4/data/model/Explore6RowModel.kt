package com.application.app.modules.explore4.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore6RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSubTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_sub_title)

)
