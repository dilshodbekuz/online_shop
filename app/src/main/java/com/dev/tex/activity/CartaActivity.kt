package com.dev.tex.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dev.tex.R
import com.dev.tex.databinding.ActivityCartaBinding
import com.dev.tex.model.AddressModel
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import org.greenrobot.eventbus.EventBus

class CartaActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityCartaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCartaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        binding.btnConfirm.setOnClickListener {
            val addressModel = AddressModel(
                "",
                mMap.cameraPosition.target.latitude,
                mMap.cameraPosition.target.longitude
            )
            EventBus.getDefault().post(addressModel)
            finish()

        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
    }
}