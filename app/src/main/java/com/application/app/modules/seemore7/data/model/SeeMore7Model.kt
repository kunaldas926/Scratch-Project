package com.application.app.modules.seemore7.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SeeMore7Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDramaMovies: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_drama_movies)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtChannels: String? = MyApp.getInstance().resources.getString(R.string.lbl_channels)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUser: String? = MyApp.getInstance().resources.getString(R.string.lbl_user)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etSearchInActioValue: String? = null
)
