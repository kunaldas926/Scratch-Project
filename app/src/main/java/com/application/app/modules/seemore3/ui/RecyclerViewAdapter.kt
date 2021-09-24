package com.application.app.modules.seemore3.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSeeMore4Binding
import com.application.app.modules.seemore3.`data`.model.SeeMore4RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<SeeMore4RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSeeMore4VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<SeeMore4RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSeeMore4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_see_more_4,parent,false)
    return RowSeeMore4VH(view)
  }

  public override fun onBindViewHolder(holder: RowSeeMore4VH, position: Int): Unit {
    val seeMore4RowModel = SeeMore4RowModel()
    // TODO uncomment following line after integration with data source
    // val seeMore4RowModel = list[position]
    holder.binding.seeMore4RowModel = seeMore4RowModel
  }

  public override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: SeeMore4RowModel
    ): Unit {
    }
  }

  public inner class RowSeeMore4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSeeMore4Binding = RowSeeMore4Binding.bind(itemView)
  }
}
