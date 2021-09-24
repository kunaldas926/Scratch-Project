package com.application.app.modules.explore11.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowExplore13Binding
import com.application.app.modules.explore11.`data`.model.Explore13RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public var list: List<Explore13RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowExplore13VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Explore13RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore13VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore_13,parent,false)
    return RowExplore13VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore13VH, position: Int): Unit {
    val explore13RowModel = Explore13RowModel()
    // TODO uncomment following line after integration with data source
    // val explore13RowModel = list[position]
    holder.binding.explore13RowModel = explore13RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Explore13RowModel
    ): Unit {
    }
  }

  public inner class RowExplore13VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore13Binding = RowExplore13Binding.bind(itemView)
  }
}
