package com.application.app.modules.search8.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSearch9Binding
import com.application.app.modules.search8.`data`.model.Search9RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Search9RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSearch9VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Search9RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSearch9VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_search_9,parent,false)
    return RowSearch9VH(view)
  }

  public override fun onBindViewHolder(holder: RowSearch9VH, position: Int): Unit {
    val search9RowModel = Search9RowModel()
    // TODO uncomment following line after integration with data source
    // val search9RowModel = list[position]
    holder.binding.search9RowModel = search9RowModel
  }

  public override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Search9RowModel
    ): Unit {
    }
  }

  public inner class RowSearch9VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSearch9Binding = RowSearch9Binding.bind(itemView)
  }
}
