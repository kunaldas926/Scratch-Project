package com.application.app.modules.explore1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtExploreMovies: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_explore_movies)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFindSomething: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_something)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAction: String? = MyApp.getInstance().resources.getString(R.string.lbl_action)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMore: String? = MyApp.getInstance().resources.getString(R.string.lbl_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDrama: String? = MyApp.getInstance().resources.getString(R.string.lbl_drama)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMore1: String? = MyApp.getInstance().resources.getString(R.string.lbl_more)
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
  public var etSearchMoviesValue: String? = null
)
