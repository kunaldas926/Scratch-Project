package com.application.app.modules.detailpage4.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowDetailPage5Binding
import com.application.app.modules.detailpage4.`data`.model.DetailPage5RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<DetailPage5RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowDetailPage5VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<DetailPage5RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDetailPage5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_detail_page_5,parent,false)
    return RowDetailPage5VH(view)
  }

  public override fun onBindViewHolder(holder: RowDetailPage5VH, position: Int): Unit {
    val detailPage5RowModel = DetailPage5RowModel()
    // TODO uncomment following line after integration with data source
    // val detailPage5RowModel = list[position]
    holder.binding.detailPage5RowModel = detailPage5RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: DetailPage5RowModel
    ): Unit {
    }
  }

  public inner class RowDetailPage5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDetailPage5Binding = RowDetailPage5Binding.bind(itemView)
    init {
      binding.frame.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DetailPage5RowModel())
      }
    }
  }
}
