package com.application.app.modules.channel5.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityChannel5Binding
import com.application.app.modules.channel5.`data`.viewmodel.Channel5VM
import kotlin.String
import kotlin.Unit

public class Channel5Activity : BaseActivity<ActivityChannel5Binding>(R.layout.activity_channel_5) {
  private val viewModel: Channel5VM by viewModels<Channel5VM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.channel5VM = viewModel
  }

  public companion object {
    public const val TAG: String = "CHANNEL5ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Channel5Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
