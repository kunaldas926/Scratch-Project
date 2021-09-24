package com.application.app.modules.seemore3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySeeMore3Binding
import com.application.app.modules.seemore3.`data`.model.SeeMore4RowModel
import com.application.app.modules.seemore3.`data`.viewmodel.SeeMore3VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SeeMore3Activity : BaseActivity<ActivitySeeMore3Binding>(R.layout.activity_see_more_3)
    {
  private val viewModel: SeeMore3VM by viewModels<SeeMore3VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: SeeMore4RowModel
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
                    override fun onItemClick(view:View, position:Int, item : SeeMore4RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.seeMore3VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEE_MORE3ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SeeMore3Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
