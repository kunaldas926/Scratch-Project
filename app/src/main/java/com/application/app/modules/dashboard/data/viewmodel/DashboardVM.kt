package com.application.app.modules.dashboard.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.dashboard.`data`.model.Dashboard1RowModel
import com.application.app.modules.dashboard.`data`.model.Dashboard2RowModel
import com.application.app.modules.dashboard.`data`.model.Dashboard3RowModel
import com.application.app.modules.dashboard.`data`.model.Dashboard4RowModel
import com.application.app.modules.dashboard.`data`.model.Dashboard5RowModel
import com.application.app.modules.dashboard.`data`.model.DashboardModel
import kotlin.collections.MutableList

public class DashboardVM : ViewModel() {
  public val dashboardModel: MutableLiveData<DashboardModel> = MutableLiveData(DashboardModel())

  public val recyclerViewList: MutableLiveData<MutableList<Dashboard1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView1List: MutableLiveData<MutableList<Dashboard2RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView2List: MutableLiveData<MutableList<Dashboard3RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView3List: MutableLiveData<MutableList<Dashboard4RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView4List: MutableLiveData<MutableList<Dashboard5RowModel>> =
      MutableLiveData(mutableListOf())
}
