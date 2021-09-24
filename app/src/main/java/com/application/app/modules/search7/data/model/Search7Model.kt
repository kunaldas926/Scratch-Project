package com.application.app.modules.search7.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Search7Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTrendingSearch: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_trending_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTreasureIsland: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_treasure_island)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoveInTrouble: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_love_in_trouble)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHotelDeLuna: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_hotel_de_luna)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTheHeirs: String? = MyApp.getInstance().resources.getString(R.string.lbl_the_heirs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhatSWrongWi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_s_wrong_wi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMobyDick: String? = MyApp.getInstance().resources.getString(R.string.lbl_moby_dick)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBulletBoy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_bullet_boy)
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
  public var etFinMoviesCasValue: String? = null
)
