package com.application.app.modules.detailpage4.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DetailPage5RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtJallikattu: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jallikattu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLijoJosePelli: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lijo_jose_pelli)

)
