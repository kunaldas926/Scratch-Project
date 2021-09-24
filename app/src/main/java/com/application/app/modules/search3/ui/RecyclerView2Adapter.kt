package com.application.app.modules.search3.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSearch6Binding
import com.application.app.modules.search3.`data`.model.Search6RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView2Adapter(
  public var list: List<Search6RowModel>
) : RecyclerView.Adapter<RecyclerView2Adapter.RowSearch6VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Search6RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSearch6VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_search_6,parent,false)
    return RowSearch6VH(view)
  }

  public override fun onBindViewHolder(holder: RowSearch6VH, position: Int): Unit {
    val search6RowModel = Search6RowModel()
    // TODO uncomment following line after integration with data source
    // val search6RowModel = list[position]
    holder.binding.search6RowModel = search6RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Search6RowModel
    ): Unit {
    }
  }

  public inner class RowSearch6VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSearch6Binding = RowSearch6Binding.bind(itemView)
  }
}
