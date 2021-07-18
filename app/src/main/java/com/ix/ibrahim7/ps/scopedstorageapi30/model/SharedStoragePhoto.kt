package com.ix.ibrahim7.ps.scopedstorageapi30.model

import android.graphics.Bitmap
import android.net.Uri

data class SharedStoragePhoto(
    val id: Long,
    val name: String,
    val width: Int,
    val height: Int,
    val contentUri: Uri
)
