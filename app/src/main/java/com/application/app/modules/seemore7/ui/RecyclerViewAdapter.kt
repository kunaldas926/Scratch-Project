package com.application.app.modules.seemore7.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSeeMore8Binding
import com.application.app.modules.seemore7.`data`.model.SeeMore8RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<SeeMore8RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSeeMore8VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<SeeMore8RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSeeMore8VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_see_more_8,parent,false)
    return RowSeeMore8VH(view)
  }

  public override fun onBindViewHolder(holder: RowSeeMore8VH, position: Int): Unit {
    val seeMore8RowModel = SeeMore8RowModel()
    // TODO uncomment following line after integration with data source
    // val seeMore8RowModel = list[position]
    holder.binding.seeMore8RowModel = seeMore8RowModel
  }

  public override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: SeeMore8RowModel
    ): Unit {
    }
  }

  public inner class RowSeeMore8VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSeeMore8Binding = RowSeeMore8Binding.bind(itemView)
  }
}
