package com.application.app.modules.detailpage2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DetailPage3RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDarkPhoenix: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dark_phoenix)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEveryHeroHas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_every_hero_has)

)
