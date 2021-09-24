package com.application.app.modules.seemore1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSeeMore2Binding
import com.application.app.modules.seemore1.`data`.model.SeeMore2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<SeeMore2RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSeeMore2VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<SeeMore2RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSeeMore2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_see_more_2,parent,false)
    return RowSeeMore2VH(view)
  }

  public override fun onBindViewHolder(holder: RowSeeMore2VH, position: Int): Unit {
    val seeMore2RowModel = SeeMore2RowModel()
    // TODO uncomment following line after integration with data source
    // val seeMore2RowModel = list[position]
    holder.binding.seeMore2RowModel = seeMore2RowModel
  }

  public override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: SeeMore2RowModel
    ): Unit {
    }
  }

  public inner class RowSeeMore2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSeeMore2Binding = RowSeeMore2Binding.bind(itemView)
  }
}
