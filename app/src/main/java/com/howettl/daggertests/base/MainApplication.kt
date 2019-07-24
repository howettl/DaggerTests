package com.howettl.daggertests.base

import android.app.Application
import com.howettl.daggertests.injection.component.ApplicationComponent
import com.howettl.daggertests.injection.component.DaggerApplicationComponent

class MainApplication : Application() {

    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
            .build()
    }

}