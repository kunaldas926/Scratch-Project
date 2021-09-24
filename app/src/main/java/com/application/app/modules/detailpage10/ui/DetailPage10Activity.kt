package com.application.app.modules.detailpage10.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityDetailPage10Binding
import com.application.app.modules.detailpage10.`data`.model.DetailPage11RowModel
import com.application.app.modules.detailpage10.`data`.viewmodel.DetailPage10VM
import com.application.app.modules.detailpage6.ui.DetailPage6Activity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DetailPage10Activity :
    BaseActivity<ActivityDetailPage10Binding>(R.layout.activity_detail_page_10) {
  private val viewModel: DetailPage10VM by viewModels<DetailPage10VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: DetailPage11RowModel
  ): Unit {
    when(view.id) {
            R.id.frame ->  {
              val destIntent = DetailPage6Activity.getIntent(this, null)
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
        DetailPage11RowModel) {
                            onClickRecyclerView(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerViewList.observe(this) {
                        recyclerViewAdapter.updateData(it)
                    }
    binding.detailPage10VM = viewModel
  }

  public companion object {
    public const val TAG: String = "DETAIL_PAGE10ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailPage10Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
