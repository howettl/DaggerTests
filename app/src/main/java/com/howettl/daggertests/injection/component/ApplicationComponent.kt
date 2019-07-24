package com.howettl.daggertests.injection.component

import com.howettl.daggertests.ui.CarFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [])
interface ApplicationComponent {

    fun inject(fragment: CarFragment)

    @Component.Builder
    interface Builder {
        fun build(): ApplicationComponent
    }

}