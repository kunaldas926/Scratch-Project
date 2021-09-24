package com.application.app.modules.search1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySearch1Binding
import com.application.app.modules.search1.`data`.model.Search2RowModel
import com.application.app.modules.search1.`data`.viewmodel.Search1VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Search1Activity : BaseActivity<ActivitySearch1Binding>(R.layout.activity_search_1) {
  private val viewModel: Search1VM by viewModels<Search1VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Search2RowModel
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
                        override fun onItemClick(view:View, position:Int, item : Search2RowModel) {
                            onClickRecyclerView(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerViewList.observe(this) {
                        recyclerViewAdapter.updateData(it)
                    }
    binding.search1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEARCH1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Search1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
