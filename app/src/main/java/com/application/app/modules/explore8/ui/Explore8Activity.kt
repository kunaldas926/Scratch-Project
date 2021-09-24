package com.application.app.modules.explore8.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityExplore8Binding
import com.application.app.modules.explore8.`data`.model.Explore10RowModel
import com.application.app.modules.explore8.`data`.model.Explore9RowModel
import com.application.app.modules.explore8.`data`.viewmodel.Explore8VM
import com.application.app.modules.seemore7.ui.SeeMore7Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Explore8Activity : BaseActivity<ActivityExplore8Binding>(R.layout.activity_explore_8) {
  private val viewModel: Explore8VM by viewModels<Explore8VM>()

  public override fun setUpClicks(): Unit {
    binding.frame1.setOnClickListener {


    }
    binding.linear8.setOnClickListener {

      val destIntent = SeeMore7Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Explore9RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: Explore10RowModel
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
                    override fun onItemClick(view:View, position:Int, item : Explore9RowModel) {
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
                    override fun onItemClick(view:View, position:Int, item : Explore10RowModel) {
                        onClickRecyclerView1(view, position, item)
                    }
                }
                )
    viewModel.recyclerView1List.observe(this) {
                    recyclerView1Adapter.updateData(it)
                }
    binding.explore8VM = viewModel
  }

  public companion object {
    public const val TAG: String = "EXPLORE8ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Explore8Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
