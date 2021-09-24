package com.application.app.modules.explore4.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityExplore4Binding
import com.application.app.modules.explore4.`data`.model.Explore5RowModel
import com.application.app.modules.explore4.`data`.model.Explore6RowModel
import com.application.app.modules.explore4.`data`.model.Explore7RowModel
import com.application.app.modules.explore4.`data`.viewmodel.Explore4VM
import com.application.app.modules.seemore7.ui.SeeMore7Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Explore4Activity : BaseActivity<ActivityExplore4Binding>(R.layout.activity_explore_4) {
  private val viewModel: Explore4VM by viewModels<Explore4VM>()

  public override fun setUpClicks(): Unit {
    binding.linear5.setOnClickListener {

      val destIntent = SeeMore7Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Explore5RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: Explore6RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerView2(
    view: View,
    position: Int,
    item: Explore7RowModel
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
                    override fun onItemClick(view:View, position:Int, item : Explore5RowModel) {
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
                    override fun onItemClick(view:View, position:Int, item : Explore6RowModel) {
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
                    override fun onItemClick(view:View, position:Int, item : Explore7RowModel) {
                        onClickRecyclerView2(view, position, item)
                    }
                }
                )
    viewModel.recyclerView2List.observe(this) {
                    recyclerView2Adapter.updateData(it)
                }
    binding.explore4VM = viewModel
  }

  public companion object {
    public const val TAG: String = "EXPLORE4ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Explore4Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
