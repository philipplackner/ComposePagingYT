package com.plcoding.composepagingyt

interface Paginator<Key, Item> {
    suspend fun loadNextItems()
    fun reset()
}