package com.daniel.ej2_chambidaniel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daniel.ej2_chambidaniel.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class AddAddressActivity : AppCompatActivity(), OnMapReadyCallback{
    private lateinit var map: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_address)
        val fragmentMap = supportFragmentManager.findFragmentById(R.id.fragment_map) as SupportMapFragment
        fragmentMap.getMapAsync(this)
    }

    override fun onMapReady(googleMap:GoogleMap) {
        map = googleMap
        val local  = LatLng(-11.9951669,-77.0929893)
        map.addMarker(MarkerOptions().title("Comunidad").position(local))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(local,16F))
    }
}