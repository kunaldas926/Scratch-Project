package com.application.app.modules.detailpage10.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DetailPage11RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTurnerHooch: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_turner_hooch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTomHanksRetur: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tom_hanks_retur)

)
