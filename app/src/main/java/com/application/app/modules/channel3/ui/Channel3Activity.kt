package com.application.app.modules.channel3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityChannel3Binding
import com.application.app.modules.channel3.`data`.model.Channel4RowModel
import com.application.app.modules.channel3.`data`.viewmodel.Channel3VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Channel3Activity : BaseActivity<ActivityChannel3Binding>(R.layout.activity_channel_3) {
  private val viewModel: Channel3VM by viewModels<Channel3VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Channel4RowModel
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
                    override fun onItemClick(view:View, position:Int, item : Channel4RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.channel3VM = viewModel
  }

  public companion object {
    public const val TAG: String = "CHANNEL3ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Channel3Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
