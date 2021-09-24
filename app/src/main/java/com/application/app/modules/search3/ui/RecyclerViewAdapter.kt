package com.application.app.modules.search3.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSearch4Binding
import com.application.app.modules.search3.`data`.model.Search4RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Search4RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSearch4VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Search4RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSearch4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_search_4,parent,false)
    return RowSearch4VH(view)
  }

  public override fun onBindViewHolder(holder: RowSearch4VH, position: Int): Unit {
    val search4RowModel = Search4RowModel()
    // TODO uncomment following line after integration with data source
    // val search4RowModel = list[position]
    holder.binding.search4RowModel = search4RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Search4RowModel
    ): Unit {
    }
  }

  public inner class RowSearch4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSearch4Binding = RowSearch4Binding.bind(itemView)
  }
}
