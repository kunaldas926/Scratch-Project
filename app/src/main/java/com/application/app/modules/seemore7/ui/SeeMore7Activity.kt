package com.application.app.modules.seemore7.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySeeMore7Binding
import com.application.app.modules.seemore7.`data`.model.SeeMore8RowModel
import com.application.app.modules.seemore7.`data`.viewmodel.SeeMore7VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SeeMore7Activity : BaseActivity<ActivitySeeMore7Binding>(R.layout.activity_see_more_7)
    {
  private val viewModel: SeeMore7VM by viewModels<SeeMore7VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: SeeMore8RowModel
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
        SeeMore8RowModel) {
                                onClickRecyclerView(view, position, item)
                            }
                        }
                        )
    viewModel.recyclerViewList.observe(this) {
                            recyclerViewAdapter.updateData(it)
                        }
    binding.seeMore7VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEE_MORE7ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SeeMore7Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
