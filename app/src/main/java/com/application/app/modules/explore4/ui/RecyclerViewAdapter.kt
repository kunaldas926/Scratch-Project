package com.application.app.modules.explore4.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowExplore5Binding
import com.application.app.modules.explore4.`data`.model.Explore5RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Explore5RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowExplore5VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Explore5RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore_5,parent,false)
    return RowExplore5VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore5VH, position: Int): Unit {
    val explore5RowModel = Explore5RowModel()
    // TODO uncomment following line after integration with data source
    // val explore5RowModel = list[position]
    holder.binding.explore5RowModel = explore5RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Explore5RowModel
    ): Unit {
    }
  }

  public inner class RowExplore5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore5Binding = RowExplore5Binding.bind(itemView)
  }
}
