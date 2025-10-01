package com.thiago.sesion3_dami.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thiago.sesion3_dami.R
import org.osmdroid.config.Configuration
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.Marker


class MapFragment : Fragment() {
    private lateinit var mapView: MapView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Configuration.getInstance().load(requireContext(), requireContext().getSharedPreferences("osm", 0))

        val view = inflater.inflate(R.layout.fragment_map, container, false)
        mapView = view.findViewById(R.id.mvStoreMap)
        mapView.setMultiTouchControls(true)

        val x = arguments?.getDouble("x") ?: -8.112334
        val y = arguments?.getDouble("y") ?: -79.028845

        val startPoint = GeoPoint(x, y)
        mapView.controller.setZoom(18.0)
        mapView.controller.setCenter(startPoint)

        val marker = Marker(mapView)
        marker.position = startPoint
        marker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
        marker.title = "Ubicación de la tienda"
        mapView.overlays.add(marker)

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mapView.onDetach()
    }
}