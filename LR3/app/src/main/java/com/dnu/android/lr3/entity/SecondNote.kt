package com.dnu.android.lr3.entity

data class SecondNote (
    override val id: Int,
    override val title: String,
    override val picture: Int,
    val subtitle : String
) : INote