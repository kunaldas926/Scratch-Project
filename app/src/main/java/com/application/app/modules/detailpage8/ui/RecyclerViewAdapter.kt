package com.application.app.modules.detailpage8.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowDetailPage9Binding
import com.application.app.modules.detailpage8.`data`.model.DetailPage9RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<DetailPage9RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowDetailPage9VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<DetailPage9RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDetailPage9VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_detail_page_9,parent,false)
    return RowDetailPage9VH(view)
  }

  public override fun onBindViewHolder(holder: RowDetailPage9VH, position: Int): Unit {
    val detailPage9RowModel = DetailPage9RowModel()
    // TODO uncomment following line after integration with data source
    // val detailPage9RowModel = list[position]
    holder.binding.detailPage9RowModel = detailPage9RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: DetailPage9RowModel
    ): Unit {
    }
  }

  public inner class RowDetailPage9VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDetailPage9Binding = RowDetailPage9Binding.bind(itemView)
    init {
      binding.frame.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DetailPage9RowModel())
      }
    }
  }
}
