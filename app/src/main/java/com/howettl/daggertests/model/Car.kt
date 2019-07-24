package com.howettl.daggertests.model

import javax.inject.Inject
import javax.inject.Singleton

// comment out the @Singleton annotation to test Dagger providing multiple instances
@Singleton
data class Car @Inject constructor(private val engine: Engine, private val body: Body, private val chassis: Chassis)