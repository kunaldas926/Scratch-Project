package com.application.app.modules.explore8.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowExplore9Binding
import com.application.app.modules.explore8.`data`.model.Explore9RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Explore9RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowExplore9VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Explore9RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore9VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore_9,parent,false)
    return RowExplore9VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore9VH, position: Int): Unit {
    val explore9RowModel = Explore9RowModel()
    // TODO uncomment following line after integration with data source
    // val explore9RowModel = list[position]
    holder.binding.explore9RowModel = explore9RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Explore9RowModel
    ): Unit {
    }
  }

  public inner class RowExplore9VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore9Binding = RowExplore9Binding.bind(itemView)
  }
}
