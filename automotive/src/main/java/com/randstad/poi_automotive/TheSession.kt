package com.randstad.poi_automotive

import android.content.Intent
import androidx.car.app.Screen
import androidx.car.app.Session

class TheSession : Session() {
    override fun onCreateScreen(intent: Intent): Screen {
        return MainScreen(carContext)
    }
}