package com.application.app.modules.detailpage2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DetailPage2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAvengersEndga: String? =
      MyApp.getInstance().resources.getString(R.string.msg_avengers_endga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt21: String? = MyApp.getInstance().resources.getString(R.string.lbl_21)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2019: String? = MyApp.getInstance().resources.getString(R.string.lbl_2019)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1Hr49min: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_hr_49min)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAction: String? = MyApp.getInstance().resources.getString(R.string.lbl_action)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2020: String? = MyApp.getInstance().resources.getString(R.string.lbl_2019)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMarvel: String? = MyApp.getInstance().resources.getString(R.string.lbl_marvel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAvengers: String? = MyApp.getInstance().resources.getString(R.string.lbl_avengers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSetInThe1990: String? =
      MyApp.getInstance().resources.getString(R.string.msg_set_in_the_1990)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYouMightAlso: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_might_also)
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
