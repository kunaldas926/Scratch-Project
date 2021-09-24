package com.application.app.modules.explore11.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore11Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTrendingMovies: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_trending_movies)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTrendingMovies1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_trending_movies)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTrendingMovies2: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_trending_movies)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExplore1: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
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

)
