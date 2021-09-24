package com.application.app.modules.detailpage2.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowDetailPage3Binding
import com.application.app.modules.detailpage2.`data`.model.DetailPage3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<DetailPage3RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowDetailPage3VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<DetailPage3RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDetailPage3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_detail_page_3,parent,false)
    return RowDetailPage3VH(view)
  }

  public override fun onBindViewHolder(holder: RowDetailPage3VH, position: Int): Unit {
    val detailPage3RowModel = DetailPage3RowModel()
    // TODO uncomment following line after integration with data source
    // val detailPage3RowModel = list[position]
    holder.binding.detailPage3RowModel = detailPage3RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: DetailPage3RowModel
    ): Unit {
    }
  }

  public inner class RowDetailPage3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDetailPage3Binding = RowDetailPage3Binding.bind(itemView)
    init {
      binding.frame.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DetailPage3RowModel())
      }
    }
  }
}
