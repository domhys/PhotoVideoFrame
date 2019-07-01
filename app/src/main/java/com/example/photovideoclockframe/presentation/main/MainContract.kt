package com.example.photovideoclockframe.presentation.main

import android.content.ContentResolver
import com.example.photovideoclockframe.presentation.IBasePresenter
import com.example.photovideoclockframe.presentation.IBaseView

interface MainContract {

    interface View : IBaseView<Presenter> {
        val resolver: ContentResolver
        fun setCurrentTime()
        fun loadNewMedia(path: String, mediaType: MEDIA_TYPE)
    }

    interface Presenter: IBasePresenter {
        fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray)
    }
}