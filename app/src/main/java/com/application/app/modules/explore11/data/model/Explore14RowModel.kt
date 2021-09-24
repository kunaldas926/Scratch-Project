package com.application.app.modules.explore11.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore14RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtYesterday: String? = MyApp.getInstance().resources.getString(R.string.lbl_yesterday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEveryone: String? = MyApp.getInstance().resources.getString(R.string.lbl_everyone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt45: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)

)
