package com.application.app.modules.dashboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityDashboardBinding
import com.application.app.modules.dashboard.`data`.model.Dashboard1RowModel
import com.application.app.modules.dashboard.`data`.model.Dashboard2RowModel
import com.application.app.modules.dashboard.`data`.model.Dashboard3RowModel
import com.application.app.modules.dashboard.`data`.model.Dashboard4RowModel
import com.application.app.modules.dashboard.`data`.model.Dashboard5RowModel
import com.application.app.modules.dashboard.`data`.viewmodel.DashboardVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DashboardActivity : BaseActivity<ActivityDashboardBinding>(R.layout.activity_dashboard)
    {
  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Dashboard1RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: Dashboard2RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerView2(
    view: View,
    position: Int,
    item: Dashboard3RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerView3(
    view: View,
    position: Int,
    item: Dashboard4RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerView4(
    view: View,
    position: Int,
    item: Dashboard5RowModel
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
                        override fun onItemClick(view:View, position:Int, item : Dashboard1RowModel)
        {
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
                        override fun onItemClick(view:View, position:Int, item : Dashboard2RowModel)
        {
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
                        override fun onItemClick(view:View, position:Int, item : Dashboard3RowModel)
        {
                            onClickRecyclerView2(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerView2List.observe(this) {
                        recyclerView2Adapter.updateData(it)
                    }
    val recyclerView3Adapter =
                            RecyclerView3Adapter(viewModel.recyclerView3List.value?:mutableListOf())
    binding.recyclerView3.adapter = recyclerView3Adapter
    recyclerView3Adapter.setOnItemClickListener(
                    object : RecyclerView3Adapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item : Dashboard4RowModel)
        {
                            onClickRecyclerView3(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerView3List.observe(this) {
                        recyclerView3Adapter.updateData(it)
                    }
    val recyclerView4Adapter =
                            RecyclerView4Adapter(viewModel.recyclerView4List.value?:mutableListOf())
    binding.recyclerView4.adapter = recyclerView4Adapter
    recyclerView4Adapter.setOnItemClickListener(
                    object : RecyclerView4Adapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item : Dashboard5RowModel)
        {
                            onClickRecyclerView4(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerView4List.observe(this) {
                        recyclerView4Adapter.updateData(it)
                    }
    binding.dashboardVM = viewModel
  }

  public companion object {
    public const val TAG: String = "DASHBOARD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
