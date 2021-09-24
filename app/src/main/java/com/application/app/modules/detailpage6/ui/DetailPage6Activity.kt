package com.application.app.modules.detailpage6.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityDetailPage6Binding
import com.application.app.modules.detailpage6.`data`.model.DetailPage7RowModel
import com.application.app.modules.detailpage6.`data`.viewmodel.DetailPage6VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DetailPage6Activity :
    BaseActivity<ActivityDetailPage6Binding>(R.layout.activity_detail_page_6) {
  private val viewModel: DetailPage6VM by viewModels<DetailPage6VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: DetailPage7RowModel
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
                        override fun onItemClick(view:View, position:Int, item :
        DetailPage7RowModel) {
                            onClickRecyclerView(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerViewList.observe(this) {
                        recyclerViewAdapter.updateData(it)
                    }
    binding.detailPage6VM = viewModel
  }

  public companion object {
    public const val TAG: String = "DETAIL_PAGE6ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailPage6Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
