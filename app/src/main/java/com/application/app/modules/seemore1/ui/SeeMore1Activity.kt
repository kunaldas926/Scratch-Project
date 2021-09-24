package com.application.app.modules.seemore1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySeeMore1Binding
import com.application.app.modules.seemore1.`data`.model.SeeMore2RowModel
import com.application.app.modules.seemore1.`data`.viewmodel.SeeMore1VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SeeMore1Activity : BaseActivity<ActivitySeeMore1Binding>(R.layout.activity_see_more_1)
    {
  private val viewModel: SeeMore1VM by viewModels<SeeMore1VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: SeeMore2RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public override fun onInitialized(): Unit {
    val recyclerViewAdapter =
                        RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : SeeMore2RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.seeMore1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEE_MORE1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SeeMore1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
