package com.example.bankapp

import android.app.Application
import com.example.homeflow.di.homeFlowModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import com.example.lifeinsuranceflow.di.lifeInsuranceFlowModule

class App : Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@App)
            modules(KOIN_MODULES)
        }
    }

    companion object {
        val KOIN_MODULES = listOf(
            lifeInsuranceFlowModule,
            homeFlowModule
        )
    }
}