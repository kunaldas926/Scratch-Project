package com.application.app.modules.account4.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Account5RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNotification: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notification)

)
