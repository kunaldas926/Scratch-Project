package com.application.app.modules.authentication2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Authentication2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPutYourEmail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_put_your_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDavid20Gmail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_david_20_gmail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLbl: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDonTHaveAnA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)

)
