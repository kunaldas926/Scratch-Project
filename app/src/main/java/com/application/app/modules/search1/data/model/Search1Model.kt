package com.application.app.modules.search1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Search1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSearchResultF: String? =
      MyApp.getInstance().resources.getString(R.string.msg_search_result_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMovies6: String? = MyApp.getInstance().resources.getString(R.string.lbl_movies_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCast4: String? = MyApp.getInstance().resources.getString(R.string.lbl_cast_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMarkLove: String? = MyApp.getInstance().resources.getString(R.string.lbl_mark_love)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJenniferLove: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jennifer_love)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMislove: String? = MyApp.getInstance().resources.getString(R.string.lbl_mislove)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLovez: String? = MyApp.getInstance().resources.getString(R.string.lbl_lovez)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCategories1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_categories_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLove: String? = MyApp.getInstance().resources.getString(R.string.lbl_love)
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
  public var etLoveValue: String? = null
)
