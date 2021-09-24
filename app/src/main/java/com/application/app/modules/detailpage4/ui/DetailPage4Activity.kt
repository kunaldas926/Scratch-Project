package com.application.app.modules.detailpage4.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityDetailPage4Binding
import com.application.app.modules.detailpage4.`data`.model.DetailPage5RowModel
import com.application.app.modules.detailpage4.`data`.viewmodel.DetailPage4VM
import com.application.app.modules.detailpage8.ui.DetailPage8Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DetailPage4Activity :
    BaseActivity<ActivityDetailPage4Binding>(R.layout.activity_detail_page_4) {
  private val viewModel: DetailPage4VM by viewModels<DetailPage4VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: DetailPage5RowModel
  ): Unit {
    when(view.id) {
        R.id.frame ->  {
          val destIntent = DetailPage8Activity.getIntent(this, null)
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
        DetailPage5RowModel) {
                            onClickRecyclerView(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerViewList.observe(this) {
                        recyclerViewAdapter.updateData(it)
                    }
    binding.detailPage4VM = viewModel
  }

  public companion object {
    public const val TAG: String = "DETAIL_PAGE4ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailPage4Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
