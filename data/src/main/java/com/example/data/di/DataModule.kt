package com.example.data.di

import com.example.data.local.json.LocalJsonRepository
import com.example.data.local.json.LocalJsonRepositoryImpl
import org.koin.dsl.module

val dataModule = module {
    single<LocalJsonRepository> {
        LocalJsonRepositoryImpl(get())
    }
}