package com.application.app.modules.seemore1.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SeeMore1Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAction: String? = MyApp.getInstance().resources.getString(R.string.lbl_action)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var txtThriller: String? = MyApp.getInstance().resources.getString(R.string.lbl_thriller)
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

)
