package com.application.app.modules.splash.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SplashModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGetStarted: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_get_started)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWatchYourFavo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_watch_your_favo)

)
