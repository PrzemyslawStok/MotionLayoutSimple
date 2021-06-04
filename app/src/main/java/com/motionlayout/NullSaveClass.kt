package com.motionlayout

import android.util.Log
import kotlin.random.Random

class NullSaveClass{
    companion object {
        val TAG = "NullSaveClass"
        fun function0() {
            Log.i(TAG,"Logowanie działa...")

            var name: String = "Przemysław"
            var surname: String? = "Stokłosa"

            //name = null

            if(true) {
                surname = null
            }

            Log.i(TAG,"Długość imienia: ${name.length}")

            Log.i(TAG, "Długość nazwiska: ${surname?.length}")

            if(surname!=null){
                Log.i(TAG, "Długość nazwiska: ${surname?.length}")
            }else{
                Log.i(TAG, "Długość nazwiska: nie zdefiniowano")
            }

            surname?.let{
                Log.i(TAG, "Długość nazwiska {let}: ${it.length}")
            }.also {
                Log.i(TAG, "Długość nazwiska {also}: nie zdefiniowano")
            }

            val newName = createName()

            if(newName!=null)
                name = newName
            else
                name = "Przemysław"

            for(i in 1..100) {
                name = createName() ?: "Przemysław"
            }

        }

        fun createName():String?{
            val rand = Random.nextInt(0,10)

            if(rand>5)
                return "Piotr"
            else
                return null
        }
    }
}