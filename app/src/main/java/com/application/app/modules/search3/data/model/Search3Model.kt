package com.application.app.modules.search3.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Search3Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSearchResultF: String? =
      MyApp.getInstance().resources.getString(R.string.msg_search_result_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMovies: String? = MyApp.getInstance().resources.getString(R.string.lbl_movies)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTvChannels: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tv_channels)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPlaylist: String? = MyApp.getInstance().resources.getString(R.string.lbl_playlist)
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
  public var etMarvelValue: String? = null
)
