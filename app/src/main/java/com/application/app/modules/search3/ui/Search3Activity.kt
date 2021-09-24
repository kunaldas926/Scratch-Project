package com.application.app.modules.search3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySearch3Binding
import com.application.app.modules.search3.`data`.model.Search4RowModel
import com.application.app.modules.search3.`data`.model.Search5RowModel
import com.application.app.modules.search3.`data`.model.Search6RowModel
import com.application.app.modules.search3.`data`.viewmodel.Search3VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Search3Activity : BaseActivity<ActivitySearch3Binding>(R.layout.activity_search_3) {
  private val viewModel: Search3VM by viewModels<Search3VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Search4RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: Search5RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerView2(
    view: View,
    position: Int,
    item: Search6RowModel
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
                    override fun onItemClick(view:View, position:Int, item : Search4RowModel) {
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
                    override fun onItemClick(view:View, position:Int, item : Search5RowModel) {
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
                    override fun onItemClick(view:View, position:Int, item : Search6RowModel) {
                        onClickRecyclerView2(view, position, item)
                    }
                }
                )
    viewModel.recyclerView2List.observe(this) {
                    recyclerView2Adapter.updateData(it)
                }
    binding.search3VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEARCH3ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Search3Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
