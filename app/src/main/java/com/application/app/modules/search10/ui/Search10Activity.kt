package com.application.app.modules.search10.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySearch10Binding
import com.application.app.modules.search10.`data`.model.Search11RowModel
import com.application.app.modules.search10.`data`.viewmodel.Search10VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Search10Activity : BaseActivity<ActivitySearch10Binding>(R.layout.activity_search_10) {
  private val viewModel: Search10VM by viewModels<Search10VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Search11RowModel
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
                    override fun onItemClick(view:View, position:Int, item : Search11RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.search10VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEARCH10ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Search10Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
