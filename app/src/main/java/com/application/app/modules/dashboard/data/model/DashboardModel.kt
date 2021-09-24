package com.application.app.modules.dashboard.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNons: String? = MyApp.getInstance().resources.getString(R.string.lbl_nons)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMoonlight: String? = MyApp.getInstance().resources.getString(R.string.lbl_moonlight)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSubLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_sub_label)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt45: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSpecialForYou: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_special_for_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUpcomingMovies: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_upcoming_movies)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeatured: String? = MyApp.getInstance().resources.getString(R.string.lbl_featured)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUpcomingMovies1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_upcoming_movies)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSpecialForYou1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_special_for_you)
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
