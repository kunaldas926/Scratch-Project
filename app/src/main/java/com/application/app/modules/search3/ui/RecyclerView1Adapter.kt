package com.application.app.modules.search3.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSearch5Binding
import com.application.app.modules.search3.`data`.model.Search5RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public var list: List<Search5RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowSearch5VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Search5RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSearch5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_search_5,parent,false)
    return RowSearch5VH(view)
  }

  public override fun onBindViewHolder(holder: RowSearch5VH, position: Int): Unit {
    val search5RowModel = Search5RowModel()
    // TODO uncomment following line after integration with data source
    // val search5RowModel = list[position]
    holder.binding.search5RowModel = search5RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Search5RowModel
    ): Unit {
    }
  }

  public inner class RowSearch5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSearch5Binding = RowSearch5Binding.bind(itemView)
  }
}
