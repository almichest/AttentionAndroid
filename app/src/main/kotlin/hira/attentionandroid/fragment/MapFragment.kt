package hira.attentionandroid.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import hira.attentionandroid.R

/**
 * Created by hira on 2016/09/11.
 */

class MapFragment: SupportMapFragment(), OnMapReadyCallback {

    private var map: GoogleMap? = nil

    override fun onCreateView(layoutInflater: LayoutInflater?, viewGroup: ViewGroup?, bundle: Bundle?): View {
//        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
//        val mapFragment = context.supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
//        mapFragment.getMapAsync(this)

        return layoutInflater.inflate(R.)
    }

    override fun onMapReady(map: GoogleMap?) {
        this.map = map

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        map!!.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        map!!.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }
}
