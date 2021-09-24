package com.application.app.modules.channel3.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowChannel4Binding
import com.application.app.modules.channel3.`data`.model.Channel4RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Channel4RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowChannel4VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Channel4RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowChannel4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_channel_4,parent,false)
    return RowChannel4VH(view)
  }

  public override fun onBindViewHolder(holder: RowChannel4VH, position: Int): Unit {
    val channel4RowModel = Channel4RowModel()
    // TODO uncomment following line after integration with data source
    // val channel4RowModel = list[position]
    holder.binding.channel4RowModel = channel4RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Channel4RowModel
    ): Unit {
    }
  }

  public inner class RowChannel4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowChannel4Binding = RowChannel4Binding.bind(itemView)
  }
}
