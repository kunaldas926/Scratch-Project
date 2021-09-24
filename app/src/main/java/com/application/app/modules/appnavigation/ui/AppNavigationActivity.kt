package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.account4.ui.Account4Activity
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.authentication2.ui.Authentication2Activity
import com.application.app.modules.channel1.ui.Channel1Activity
import com.application.app.modules.channel3.ui.Channel3Activity
import com.application.app.modules.channel5.ui.Channel5Activity
import com.application.app.modules.dashboard.ui.DashboardActivity
import com.application.app.modules.detailpage10.ui.DetailPage10Activity
import com.application.app.modules.detailpage2.ui.DetailPage2Activity
import com.application.app.modules.detailpage4.ui.DetailPage4Activity
import com.application.app.modules.detailpage6.ui.DetailPage6Activity
import com.application.app.modules.detailpage8.ui.DetailPage8Activity
import com.application.app.modules.explore1.ui.Explore1Activity
import com.application.app.modules.explore11.ui.Explore11Activity
import com.application.app.modules.explore4.ui.Explore4Activity
import com.application.app.modules.explore8.ui.Explore8Activity
import com.application.app.modules.search1.ui.Search1Activity
import com.application.app.modules.search10.ui.Search10Activity
import com.application.app.modules.search3.ui.Search3Activity
import com.application.app.modules.search7.ui.Search7Activity
import com.application.app.modules.search8.ui.Search8Activity
import com.application.app.modules.seemore1.ui.SeeMore1Activity
import com.application.app.modules.seemore3.ui.SeeMore3Activity
import com.application.app.modules.seemore5.ui.SeeMore5Activity
import com.application.app.modules.seemore7.ui.SeeMore7Activity
import com.application.app.modules.splash.ui.SplashActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun setUpClicks(): Unit {
    binding.linear19.setOnClickListener {

      val destIntent = Search7Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear17.setOnClickListener {

      val destIntent = Search1Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear9.setOnClickListener {

      val destIntent = Explore1Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear7.setOnClickListener {

      val destIntent = DetailPage8Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear5.setOnClickListener {

      val destIntent = DetailPage2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear6.setOnClickListener {

      val destIntent = DetailPage4Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear24.setOnClickListener {

      val destIntent = SeeMore7Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear8.setOnClickListener {

      val destIntent = DetailPage10Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear4.setOnClickListener {

      val destIntent = DetailPage6Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear20.setOnClickListener {

      val destIntent = Search8Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear21.setOnClickListener {

      val destIntent = Search10Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear25.setOnClickListener {

      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear12.setOnClickListener {

      val destIntent = Channel1Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear16.setOnClickListener {

      val destIntent = Authentication2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear13.setOnClickListener {

      val destIntent = Channel3Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear14.setOnClickListener {

      val destIntent = Channel5Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear15.setOnClickListener {

      val destIntent = Account4Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear11.setOnClickListener {

      val destIntent = Explore8Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear10.setOnClickListener {

      val destIntent = Explore4Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear22.setOnClickListener {

      val destIntent = SeeMore3Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear23.setOnClickListener {

      val destIntent = SeeMore5Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear3.setOnClickListener {

      val destIntent = SeeMore1Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear27.setOnClickListener {

      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear26.setOnClickListener {

      val destIntent = Explore11Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear18.setOnClickListener {

      val destIntent = Search3Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.appNavigationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
