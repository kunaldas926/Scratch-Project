package com.application.app.modules.explore4.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowExplore6Binding
import com.application.app.modules.explore4.`data`.model.Explore6RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public var list: List<Explore6RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowExplore6VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Explore6RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore6VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore_6,parent,false)
    return RowExplore6VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore6VH, position: Int): Unit {
    val explore6RowModel = Explore6RowModel()
    // TODO uncomment following line after integration with data source
    // val explore6RowModel = list[position]
    holder.binding.explore6RowModel = explore6RowModel
  }

  public override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Explore6RowModel
    ): Unit {
    }
  }

  public inner class RowExplore6VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore6Binding = RowExplore6Binding.bind(itemView)
  }
}
