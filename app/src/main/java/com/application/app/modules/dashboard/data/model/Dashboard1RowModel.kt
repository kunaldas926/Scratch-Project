package com.application.app.modules.dashboard.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Dashboard1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtThePerfection: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_perfection)

)
