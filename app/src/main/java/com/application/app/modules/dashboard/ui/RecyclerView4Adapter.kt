package com.application.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowDashboard5Binding
import com.application.app.modules.dashboard.`data`.model.Dashboard5RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView4Adapter(
  public var list: List<Dashboard5RowModel>
) : RecyclerView.Adapter<RecyclerView4Adapter.RowDashboard5VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Dashboard5RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDashboard5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_dashboard5,parent,false)
    return RowDashboard5VH(view)
  }

  public override fun onBindViewHolder(holder: RowDashboard5VH, position: Int): Unit {
    val dashboard5RowModel = Dashboard5RowModel()
    // TODO uncomment following line after integration with data source
    // val dashboard5RowModel = list[position]
    holder.binding.dashboard5RowModel = dashboard5RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Dashboard5RowModel
    ): Unit {
    }
  }

  public inner class RowDashboard5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDashboard5Binding = RowDashboard5Binding.bind(itemView)
  }
}
