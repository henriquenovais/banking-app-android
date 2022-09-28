package com.example.bankapp

import android.app.Application
import com.example.data.di.dataModule
import com.example.domain.di.domainModule
import com.example.homeflow.di.homeFlowModule
import com.example.utils.di.utilsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

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
            homeFlowModule,
            utilsModule,
            domainModule,
            dataModule
        )
    }
}