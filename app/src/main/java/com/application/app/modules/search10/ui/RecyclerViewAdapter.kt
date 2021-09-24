package com.application.app.modules.search10.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSearch11Binding
import com.application.app.modules.search10.`data`.model.Search11RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Search11RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSearch11VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Search11RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSearch11VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_search_11,parent,false)
    return RowSearch11VH(view)
  }

  public override fun onBindViewHolder(holder: RowSearch11VH, position: Int): Unit {
    val search11RowModel = Search11RowModel()
    // TODO uncomment following line after integration with data source
    // val search11RowModel = list[position]
    holder.binding.search11RowModel = search11RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Search11RowModel
    ): Unit {
    }
  }

  public inner class RowSearch11VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSearch11Binding = RowSearch11Binding.bind(itemView)
  }
}
