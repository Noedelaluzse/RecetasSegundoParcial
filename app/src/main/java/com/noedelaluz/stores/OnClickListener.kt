package com.noedelaluz.stores

interface OnClickListener {
    fun onClick(storeId: Long)
    fun onFavoriteStore(store: StoreEntity)
    fun onDeleteStore(store: StoreEntity)
}