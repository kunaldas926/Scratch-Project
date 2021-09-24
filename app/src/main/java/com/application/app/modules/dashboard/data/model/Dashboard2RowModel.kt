package com.application.app.modules.dashboard.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Dashboard2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtJumanjiTheNex: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jumanji_the_nex)

)
