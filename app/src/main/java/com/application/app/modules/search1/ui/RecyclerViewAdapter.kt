package com.application.app.modules.search1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSearch2Binding
import com.application.app.modules.search1.`data`.model.Search2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Search2RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSearch2VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Search2RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSearch2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_search_2,parent,false)
    return RowSearch2VH(view)
  }

  public override fun onBindViewHolder(holder: RowSearch2VH, position: Int): Unit {
    val search2RowModel = Search2RowModel()
    // TODO uncomment following line after integration with data source
    // val search2RowModel = list[position]
    holder.binding.search2RowModel = search2RowModel
  }

  public override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Search2RowModel
    ): Unit {
    }
  }

  public inner class RowSearch2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSearch2Binding = RowSearch2Binding.bind(itemView)
  }
}
