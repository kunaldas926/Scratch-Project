package com.application.app.modules.seemore1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SeeMore2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDarkTower: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dark_tower)

)
