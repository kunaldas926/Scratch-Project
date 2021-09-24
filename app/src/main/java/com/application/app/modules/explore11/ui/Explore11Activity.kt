package com.application.app.modules.explore11.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityExplore11Binding
import com.application.app.modules.explore11.`data`.model.Explore12RowModel
import com.application.app.modules.explore11.`data`.model.Explore13RowModel
import com.application.app.modules.explore11.`data`.model.Explore14RowModel
import com.application.app.modules.explore11.`data`.viewmodel.Explore11VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Explore11Activity :
    BaseActivity<ActivityExplore11Binding>(R.layout.activity_explore_11) {
  private val viewModel: Explore11VM by viewModels<Explore11VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Explore12RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: Explore13RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerView2(
    view: View,
    position: Int,
    item: Explore14RowModel
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
                    override fun onItemClick(view:View, position:Int, item : Explore12RowModel) {
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
                    override fun onItemClick(view:View, position:Int, item : Explore13RowModel) {
                        onClickRecyclerView1(view, position, item)
                    }
                }
                )
    viewModel.recyclerView1List.observe(this) {
                    recyclerView1Adapter.updateData(it)
                }
    val recyclerView2Adapter =
                        RecyclerView2Adapter(viewModel.recyclerView2List.value?:mutableListOf())
    binding.recyclerView2.adapter = recyclerView2Adapter
    recyclerView2Adapter.setOnItemClickListener(
                object : RecyclerView2Adapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : Explore14RowModel) {
                        onClickRecyclerView2(view, position, item)
                    }
                }
                )
    viewModel.recyclerView2List.observe(this) {
                    recyclerView2Adapter.updateData(it)
                }
    binding.explore11VM = viewModel
  }

  public companion object {
    public const val TAG: String = "EXPLORE11ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Explore11Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
