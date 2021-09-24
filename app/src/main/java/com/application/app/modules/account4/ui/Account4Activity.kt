package com.application.app.modules.account4.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAccount4Binding
import com.application.app.modules.account4.`data`.model.Account5RowModel
import com.application.app.modules.account4.`data`.viewmodel.Account4VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Account4Activity : BaseActivity<ActivityAccount4Binding>(R.layout.activity_account_4) {
  private val viewModel: Account4VM by viewModels<Account4VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Account5RowModel
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
                    override fun onItemClick(view:View, position:Int, item : Account5RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.account4VM = viewModel
  }

  public companion object {
    public const val TAG: String = "ACCOUNT4ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Account4Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
