package com.application.app.modules.detailpage8.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityDetailPage8Binding
import com.application.app.modules.detailpage10.ui.DetailPage10Activity
import com.application.app.modules.detailpage8.`data`.model.DetailPage9RowModel
import com.application.app.modules.detailpage8.`data`.viewmodel.DetailPage8VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DetailPage8Activity :
    BaseActivity<ActivityDetailPage8Binding>(R.layout.activity_detail_page_8) {
  private val viewModel: DetailPage8VM by viewModels<DetailPage8VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: DetailPage9RowModel
  ): Unit {
    when(view.id) {
    R.id.frame ->  {
      val destIntent = DetailPage10Activity.getIntent(this, null)
      startActivity(destIntent)
    }


    }
  }

  public override fun onInitialized(): Unit {
    val recyclerViewAdapter =
                            RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                    object : RecyclerViewAdapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item :
        DetailPage9RowModel) {
                            onClickRecyclerView(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerViewList.observe(this) {
                        recyclerViewAdapter.updateData(it)
                    }
    binding.detailPage8VM = viewModel
  }

  public companion object {
    public const val TAG: String = "DETAIL_PAGE8ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailPage8Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
