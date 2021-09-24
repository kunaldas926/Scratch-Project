package com.application.app.modules.search8.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Search9RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGhostWriter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ghost_writer)

)
