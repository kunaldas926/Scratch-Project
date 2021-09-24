package com.application.app.modules.authentication2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAuthentication2Binding
import com.application.app.modules.authentication2.`data`.viewmodel.Authentication2VM
import com.application.app.modules.dashboard.ui.DashboardActivity
import kotlin.String
import kotlin.Unit

public class Authentication2Activity :
    BaseActivity<ActivityAuthentication2Binding>(R.layout.activity_authentication_2) {
  private val viewModel: Authentication2VM by viewModels<Authentication2VM>()

  public override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {

          val destIntent = DashboardActivity.getIntent(this, null)
          startActivity(destIntent)

        }
  }

  public override fun onInitialized(): Unit {
    binding.authentication2VM = viewModel
  }

  public companion object {
    public const val TAG: String = "AUTHENTICATION2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Authentication2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
