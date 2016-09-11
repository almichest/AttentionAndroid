package hira.attentionandroid.fragment

import android.os.Bundle
import android.view.View
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

/**
 * Created by hira on 2016/09/11.
 */

class MapFragment: SupportMapFragment(), OnMapReadyCallback {

    private var map: GoogleMap? = null

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap?) {
        this.map = map

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        map!!.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        map!!.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }
}
