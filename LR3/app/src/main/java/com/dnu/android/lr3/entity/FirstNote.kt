package com.dnu.android.lr3.entity

data class FirstNote (
    override val id: Int,
    override val title: String,
    override val picture: Int
) : INote