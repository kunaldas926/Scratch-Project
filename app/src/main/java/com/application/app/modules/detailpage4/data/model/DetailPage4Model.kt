package com.application.app.modules.detailpage4.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DetailPage4Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTheLastBlack: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_last_black)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2019: String? = MyApp.getInstance().resources.getString(R.string.lbl_2019)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAction: String? = MyApp.getInstance().resources.getString(R.string.lbl_action)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt45: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPlayNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_play_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTheStoryOfTw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_story_of_tw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDirector: String? = MyApp.getInstance().resources.getString(R.string.lbl_director)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAnnaBodenRya: String? =
      MyApp.getInstance().resources.getString(R.string.msg_anna_boden_rya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCast: String? = MyApp.getInstance().resources.getString(R.string.lbl_cast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBrieLarsonSa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_brie_larson_sa)
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
