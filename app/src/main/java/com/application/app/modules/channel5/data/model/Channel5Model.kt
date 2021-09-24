package com.application.app.modules.channel5.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Channel5Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLiveChannel: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_live_channel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSchedule: String? = MyApp.getInstance().resources.getString(R.string.lbl_schedule)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLastTimeWeMe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_last_time_we_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt0200AmEst: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_02_00_am_est)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoveYouMore: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_love_you_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt0400AmEst: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_04_00_am_est)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPain: String? = MyApp.getInstance().resources.getString(R.string.lbl_pain)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt0500AmEst: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_05_00_am_est)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIDonTThinkS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_don_t_think_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt0600AmEst: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_06_00_am_est)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWar: String? = MyApp.getInstance().resources.getString(R.string.lbl_war)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt0800AmEst: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_08_00_am_est)
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
