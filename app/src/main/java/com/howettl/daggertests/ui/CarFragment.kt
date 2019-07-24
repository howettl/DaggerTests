package com.howettl.daggertests.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.howettl.daggertests.R
import com.howettl.daggertests.base.InjectedFragment
import com.howettl.daggertests.injection.component.ApplicationComponent
import com.howettl.daggertests.model.Car
import kotlinx.android.synthetic.main.fragment_car.*
import javax.inject.Inject

class CarFragment : InjectedFragment() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun inject(component: ApplicationComponent) {
        component.inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_car, container, false)

    override fun onResume() {
        super.onResume()

        if (car1 == car2) {
            results_label.text = "Car1 and Car2 are identical references."
        } else {
            results_label.text = "Car1 and Car2 are distinct objects."
        }
    }
}