package com.application.app.modules.explore11.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore13RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRadioflash: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_radioflash)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSubLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_sub_label)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt45: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)

)
