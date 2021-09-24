package com.application.app.modules.detailpage8.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DetailPage9RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtArana: String? = MyApp.getInstance().resources.getString(R.string.lbl_arana)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtElPasadoEsta: String? =
      MyApp.getInstance().resources.getString(R.string.msg_el_pasado_esta)

)
