package com.application.app.modules.explore11.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowExplore14Binding
import com.application.app.modules.explore11.`data`.model.Explore14RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView2Adapter(
  public var list: List<Explore14RowModel>
) : RecyclerView.Adapter<RecyclerView2Adapter.RowExplore14VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Explore14RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore14VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore_14,parent,false)
    return RowExplore14VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore14VH, position: Int): Unit {
    val explore14RowModel = Explore14RowModel()
    // TODO uncomment following line after integration with data source
    // val explore14RowModel = list[position]
    holder.binding.explore14RowModel = explore14RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Explore14RowModel
    ): Unit {
    }
  }

  public inner class RowExplore14VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore14Binding = RowExplore14Binding.bind(itemView)
  }
}
