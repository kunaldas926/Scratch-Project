package com.application.app.modules.explore1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowExplore3Binding
import com.application.app.modules.explore1.`data`.model.Explore3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public var list: List<Explore3RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowExplore3VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Explore3RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore_3,parent,false)
    return RowExplore3VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore3VH, position: Int): Unit {
    val explore3RowModel = Explore3RowModel()
    // TODO uncomment following line after integration with data source
    // val explore3RowModel = list[position]
    holder.binding.explore3RowModel = explore3RowModel
  }

  public override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Explore3RowModel
    ): Unit {
    }
  }

  public inner class RowExplore3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore3Binding = RowExplore3Binding.bind(itemView)
  }
}
