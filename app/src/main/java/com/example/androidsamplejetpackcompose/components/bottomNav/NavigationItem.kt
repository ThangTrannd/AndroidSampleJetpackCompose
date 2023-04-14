package com.example.androidsamplejetpackcompose.components.bottomNav

import com.example.androidsamplejetpackcompose.R

sealed class NavigationItem(var route : String , var icon : Int , var title : String){
    object Discovery : NavigationItem("discovery", R.drawable.home_24px,"Khám phá")
    object Group : NavigationItem("group", R.drawable.groups_24px,"Cộng đồng")
    object Notification : NavigationItem("notification",R.drawable.notifications_24px,"Thông báo")
    object Rank : NavigationItem("rank",R.drawable.leaderboard_24px,"Xếp hạng")
    object Account : NavigationItem("account",R.drawable.person_24px,"Tài khoản")
}
