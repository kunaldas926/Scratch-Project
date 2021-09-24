package com.application.app.modules.explore11.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowExplore12Binding
import com.application.app.modules.explore11.`data`.model.Explore12RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Explore12RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowExplore12VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Explore12RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore12VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore_12,parent,false)
    return RowExplore12VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore12VH, position: Int): Unit {
    val explore12RowModel = Explore12RowModel()
    // TODO uncomment following line after integration with data source
    // val explore12RowModel = list[position]
    holder.binding.explore12RowModel = explore12RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Explore12RowModel
    ): Unit {
    }
  }

  public inner class RowExplore12VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore12Binding = RowExplore12Binding.bind(itemView)
  }
}
