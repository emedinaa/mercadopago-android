package com.emedinaa.mercadopagoapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.mercadopago.android.px.core.MercadoPagoCheckout


/**
 * @author Eduardo Medina
 * https://github.com/mercadopago/px-android
 */
private const val REQUEST_CODE = 100

class MainFragment : Fragment() {

    private fun demo() {
        val checkout = MercadoPagoCheckout.Builder("public_key", "checkout_preference_id")
            .build()
        checkout.startPayment(requireContext(), REQUEST_CODE)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button).setOnClickListener {
            demo()
        }
    }
}