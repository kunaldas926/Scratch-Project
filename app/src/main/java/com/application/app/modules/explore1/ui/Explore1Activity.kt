package com.application.app.modules.explore1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityExplore1Binding
import com.application.app.modules.explore1.`data`.model.Explore2RowModel
import com.application.app.modules.explore1.`data`.model.Explore3RowModel
import com.application.app.modules.explore1.`data`.viewmodel.Explore1VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Explore1Activity : BaseActivity<ActivityExplore1Binding>(R.layout.activity_explore_1) {
  private val viewModel: Explore1VM by viewModels<Explore1VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Explore2RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: Explore3RowModel
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
                    override fun onItemClick(view:View, position:Int, item : Explore2RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    val recyclerView1Adapter =
                        RecyclerView1Adapter(viewModel.recyclerView1List.value?:mutableListOf())
    binding.recyclerView1.adapter = recyclerView1Adapter
    recyclerView1Adapter.setOnItemClickListener(
                object : RecyclerView1Adapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : Explore3RowModel) {
                        onClickRecyclerView1(view, position, item)
                    }
                }
                )
    viewModel.recyclerView1List.observe(this) {
                    recyclerView1Adapter.updateData(it)
                }
    binding.explore1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "EXPLORE1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Explore1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
