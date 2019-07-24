package com.howettl.daggertests.base

import android.content.Context
import androidx.fragment.app.Fragment
import com.howettl.daggertests.injection.component.ApplicationComponent

abstract class InjectedFragment: Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)

        inject(getApplicationComponent() ?: return)
    }

    abstract fun inject(component: ApplicationComponent)

    private fun getApplicationComponent(): ApplicationComponent? =
        (activity?.application as? MainApplication)?.applicationComponent

}