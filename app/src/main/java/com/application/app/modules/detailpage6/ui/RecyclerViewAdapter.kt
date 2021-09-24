package com.application.app.modules.detailpage6.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowDetailPage7Binding
import com.application.app.modules.detailpage6.`data`.model.DetailPage7RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<DetailPage7RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowDetailPage7VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<DetailPage7RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDetailPage7VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_detail_page_7,parent,false)
    return RowDetailPage7VH(view)
  }

  public override fun onBindViewHolder(holder: RowDetailPage7VH, position: Int): Unit {
    val detailPage7RowModel = DetailPage7RowModel()
    // TODO uncomment following line after integration with data source
    // val detailPage7RowModel = list[position]
    holder.binding.detailPage7RowModel = detailPage7RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: DetailPage7RowModel
    ): Unit {
    }
  }

  public inner class RowDetailPage7VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDetailPage7Binding = RowDetailPage7Binding.bind(itemView)
  }
}
