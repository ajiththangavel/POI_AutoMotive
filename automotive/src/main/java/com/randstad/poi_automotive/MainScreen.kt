package com.randstad.poi_automotive

import Data.Model.PlacesRepository
import android.text.Spannable
import android.text.SpannableString
import android.util.Log
import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.CarLocation
import androidx.car.app.model.Distance
import androidx.car.app.model.DistanceSpan
import androidx.car.app.model.ItemList
import androidx.car.app.model.Metadata
import androidx.car.app.model.Place
import androidx.car.app.model.PlaceListMapTemplate
import androidx.car.app.model.PlaceMarker
import androidx.car.app.model.Row
import androidx.car.app.model.Template
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent


class MainScreen(carContext: CarContext) : Screen(carContext) {
    init {
        lifecycle.addObserver(object : LifecycleObserver {
            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            fun onStart() {
                Log.i("mytag", "HelloWorldScreen onStart() method")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            fun onStop() {
                Log.i("mytag", "HelloWorldScreen onStop() method")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            fun onDestroy() {
                Log.i("mytag", "HelloWorldScreen onDestroy() method")
            }
        })
    }
    override fun onGetTemplate(): Template {
        val placesRepository = PlacesRepository()

        val itemListBuilder = ItemList.Builder().setNoItemsMessage("No places found")
//val places = placesRepository.getPlaces()

        placesRepository.getPlaces().forEach{
            itemListBuilder.addItem(
                Row.Builder()
                    .setTitle(it.location_name)
                    .addText(SpannableString(" ").apply {
                        setSpan(
                            DistanceSpan.create(
                                Distance.create(Math.random()*100, Distance.UNIT_KILOMETERS)),
                            0,1,
                            Spannable.SPAN_INCLUSIVE_INCLUSIVE)
                    })
                    .setOnClickListener {
                        screenManager.push(DetailScreen(carContext,it.Id))
                    }

                    .setMetadata(
                        Metadata.Builder()
                            .setPlace(
                                Place.Builder(CarLocation.create(it.latitude,it.longitude))
                                    .setMarker(PlaceMarker.Builder().build())
                                    .build()
                            ).build()

                    )
                    .build()
            )
        }

        return PlaceListMapTemplate.Builder()
            .setTitle("Places of Interest")
            .setItemList(itemListBuilder.build())
            .build()
    }

}