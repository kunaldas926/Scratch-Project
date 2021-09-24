package com.application.app.modules.search7.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySearch7Binding
import com.application.app.modules.search1.ui.Search1Activity
import com.application.app.modules.search7.`data`.viewmodel.Search7VM
import kotlin.String
import kotlin.Unit

public class Search7Activity : BaseActivity<ActivitySearch7Binding>(R.layout.activity_search_7) {
  private val viewModel: Search7VM by viewModels<Search7VM>()

  public override fun setUpClicks(): Unit {
    binding.etFinMoviesCas.setOnClickListener {

      val destIntent = Search1Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.search7VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEARCH7ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Search7Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
