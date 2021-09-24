package com.application.app.modules.channel3.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Channel3Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLiveChannel: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_live_channel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTheLastBlack: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_last_black)
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
  public var txtSpecialForYou: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_special_for_you)
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
