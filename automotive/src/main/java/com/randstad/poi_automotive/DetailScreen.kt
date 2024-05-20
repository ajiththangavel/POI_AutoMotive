package com.randstad.poi_automotive

import Data.Model.PlacesRepository
import Data.Model.toIntent
import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.ActionStrip
import androidx.car.app.model.CarIcon
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Pane
import androidx.car.app.model.PaneTemplate
import androidx.car.app.model.Row
import androidx.car.app.model.Template
import androidx.core.graphics.drawable.IconCompat

class DetailScreen(carContext: CarContext, private val placeID : Int) : Screen(carContext) {
    private var isFavorite : Boolean = false
    override fun onGetTemplate() : Template {

        val place =PlacesRepository().getPlace(placeID)
            ?: return MessageTemplate.Builder("Place Not Found")
                .setHeaderAction(Action.BACK)
                .build()

        val navigateAction = Action.Builder()
            .setTitle("Navigate")
            .setOnClickListener{
                carContext.startCarApp(place.toIntent(CarContext.ACTION_NAVIGATE))
            }.build()
        val actionStrip = ActionStrip.Builder()
            .addAction(
                Action.Builder()
                    .setIcon(
                        CarIcon.Builder(
                            IconCompat.createWithResource(
                                carContext,
                                R.drawable.baseline_favorite_24

                            )
                        ).build()
                    ).setOnClickListener {
                        //setting  variable value
                        isFavorite = true
                        invalidate()

                    }.build()
            ).build()
        return PaneTemplate.Builder(
            Pane.Builder().addAction(navigateAction)
                .addRow(Row.Builder()
                    .setTitle("Coordinates")
                    .addText("Latitude: ${place.latitude},Longitude: ${place.longitude}")
                    .build()
                )
                .addRow(
                    Row.Builder()
                    .setTitle("Description")
                    .addText(place.description)
                    .build()
                ).build()
        ).setTitle(place.location_name)
            .setHeaderAction(Action.BACK)
            .setActionStrip(actionStrip)
            .build()

    }

}