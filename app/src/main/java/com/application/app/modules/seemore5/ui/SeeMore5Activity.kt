package com.application.app.modules.seemore5.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySeeMore5Binding
import com.application.app.modules.seemore5.`data`.model.SeeMore6RowModel
import com.application.app.modules.seemore5.`data`.viewmodel.SeeMore5VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SeeMore5Activity : BaseActivity<ActivitySeeMore5Binding>(R.layout.activity_see_more_5)
    {
  private val viewModel: SeeMore5VM by viewModels<SeeMore5VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: SeeMore6RowModel
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
                    override fun onItemClick(view:View, position:Int, item : SeeMore6RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.seeMore5VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEE_MORE5ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SeeMore5Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
