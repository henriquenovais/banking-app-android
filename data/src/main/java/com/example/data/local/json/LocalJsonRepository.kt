package com.example.data.local.json

interface LocalJsonRepository {
    fun reallyCoolTestMethod() : String
    fun readJsonFile(path: String) : String
}