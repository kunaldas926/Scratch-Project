package com.application.app.modules.seemore5.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSeeMore6Binding
import com.application.app.modules.seemore5.`data`.model.SeeMore6RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<SeeMore6RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSeeMore6VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<SeeMore6RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSeeMore6VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_see_more_6,parent,false)
    return RowSeeMore6VH(view)
  }

  public override fun onBindViewHolder(holder: RowSeeMore6VH, position: Int): Unit {
    val seeMore6RowModel = SeeMore6RowModel()
    // TODO uncomment following line after integration with data source
    // val seeMore6RowModel = list[position]
    holder.binding.seeMore6RowModel = seeMore6RowModel
  }

  public override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: SeeMore6RowModel
    ): Unit {
    }
  }

  public inner class RowSeeMore6VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSeeMore6Binding = RowSeeMore6Binding.bind(itemView)
  }
}
