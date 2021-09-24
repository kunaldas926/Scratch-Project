package com.application.app.modules.explore8.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore8Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCategoriesYou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_categories_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBestMovie: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_best_movie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_label)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt45: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt0000: String? = MyApp.getInstance().resources.getString(R.string.lbl_00_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDrama: String? = MyApp.getInstance().resources.getString(R.string.lbl_drama)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMore: String? = MyApp.getInstance().resources.getString(R.string.lbl_more)
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
