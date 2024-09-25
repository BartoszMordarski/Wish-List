package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName="wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object dummyWish{
    val wishList = listOf(
        Wish(title="Ferragamo Uomo Black", description = "cheap coffe and manly scent"),
        Wish(title="JPG Scandal", description = "sweet scent from jpg"),
        Wish(title="Versace Dylan Blue", description = "a versatile fragrance that is fresh and masculine"),
        Wish(title="JPG Le Male Le Parfum", description = "The best version of JPG le male")
    )
}
