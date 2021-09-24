package com.application.app.modules.account4.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowAccount5Binding
import com.application.app.modules.account4.`data`.model.Account5RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Account5RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowAccount5VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Account5RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAccount5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_account_5,parent,false)
    return RowAccount5VH(view)
  }

  public override fun onBindViewHolder(holder: RowAccount5VH, position: Int): Unit {
    val account5RowModel = Account5RowModel()
    // TODO uncomment following line after integration with data source
    // val account5RowModel = list[position]
    holder.binding.account5RowModel = account5RowModel
  }

  public override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Account5RowModel
    ): Unit {
    }
  }

  public inner class RowAccount5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowAccount5Binding = RowAccount5Binding.bind(itemView)
  }
}
