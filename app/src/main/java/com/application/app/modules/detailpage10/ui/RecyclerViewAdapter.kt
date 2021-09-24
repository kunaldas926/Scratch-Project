package com.application.app.modules.detailpage10.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowDetailPage11Binding
import com.application.app.modules.detailpage10.`data`.model.DetailPage11RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<DetailPage11RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowDetailPage11VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<DetailPage11RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDetailPage11VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_detail_page_11,parent,false)
    return RowDetailPage11VH(view)
  }

  public override fun onBindViewHolder(holder: RowDetailPage11VH, position: Int): Unit {
    val detailPage11RowModel = DetailPage11RowModel()
    // TODO uncomment following line after integration with data source
    // val detailPage11RowModel = list[position]
    holder.binding.detailPage11RowModel = detailPage11RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: DetailPage11RowModel
    ): Unit {
    }
  }

  public inner class RowDetailPage11VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDetailPage11Binding = RowDetailPage11Binding.bind(itemView)
    init {
      binding.frame.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DetailPage11RowModel())
      }
    }
  }
}
