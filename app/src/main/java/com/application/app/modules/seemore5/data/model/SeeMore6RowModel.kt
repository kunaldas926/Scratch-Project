package com.application.app.modules.seemore5.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SeeMore6RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtJallikattu: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jallikattu)

)
