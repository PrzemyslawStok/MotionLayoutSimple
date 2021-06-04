package com.motionlayout

import android.util.Log

class NullSaveClass{
    companion object {
        fun function0() {
            Log.i("NullSaveClass","Logowanie działa...")

            var name: String = "Przemysław"
            var surname: String? = "Stokłosa"

            //name = null
            surname = null
        }
    }
}