package com.application.app.modules.dashboard.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Dashboard4RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLukas: String? = MyApp.getInstance().resources.getString(R.string.lbl_lukas)

)
