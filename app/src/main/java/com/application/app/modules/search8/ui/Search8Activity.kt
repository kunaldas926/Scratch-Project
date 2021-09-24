package com.application.app.modules.search8.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySearch8Binding
import com.application.app.modules.search8.`data`.model.Search9RowModel
import com.application.app.modules.search8.`data`.viewmodel.Search8VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Search8Activity : BaseActivity<ActivitySearch8Binding>(R.layout.activity_search_8) {
  private val viewModel: Search8VM by viewModels<Search8VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Search9RowModel
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
                    override fun onItemClick(view:View, position:Int, item : Search9RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.search8VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEARCH8ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Search8Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
