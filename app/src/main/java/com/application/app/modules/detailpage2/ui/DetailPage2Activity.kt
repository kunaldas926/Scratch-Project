package com.application.app.modules.detailpage2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityDetailPage2Binding
import com.application.app.modules.detailpage2.`data`.model.DetailPage3RowModel
import com.application.app.modules.detailpage2.`data`.viewmodel.DetailPage2VM
import com.application.app.modules.detailpage4.ui.DetailPage4Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DetailPage2Activity :
    BaseActivity<ActivityDetailPage2Binding>(R.layout.activity_detail_page_2) {
  private val viewModel: DetailPage2VM by viewModels<DetailPage2VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: DetailPage3RowModel
  ): Unit {
    when(view.id) {
    R.id.frame ->  {
      val destIntent = DetailPage4Activity.getIntent(this, null)
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
                    override fun onItemClick(view:View, position:Int, item : DetailPage3RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.detailPage2VM = viewModel
  }

  public companion object {
    public const val TAG: String = "DETAIL_PAGE2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailPage2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
