package com.application.app.modules.detailpage6.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DetailPage7RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtIoNetflix: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_io_netflix)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtInNearFuture: String? =
      MyApp.getInstance().resources.getString(R.string.msg_in_near_future)

)
