package com.application.app.modules.channel1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowChannel2Binding
import com.application.app.modules.channel1.`data`.model.Channel2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Channel2RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowChannel2VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Channel2RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowChannel2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_channel_2,parent,false)
    return RowChannel2VH(view)
  }

  public override fun onBindViewHolder(holder: RowChannel2VH, position: Int): Unit {
    val channel2RowModel = Channel2RowModel()
    // TODO uncomment following line after integration with data source
    // val channel2RowModel = list[position]
    holder.binding.channel2RowModel = channel2RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Channel2RowModel
    ): Unit {
    }
  }

  public inner class RowChannel2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowChannel2Binding = RowChannel2Binding.bind(itemView)
  }
}
