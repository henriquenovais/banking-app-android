package com.example.data.json

import java.io.BufferedReader
import java.io.FileReader

class LocalJsonRepositoryImpl(private var bufferedReaderWithFilePath: BufferedReader) : LocalJsonRepository{

    //TODO: Remove after architecture PoC
    override fun reallyCoolTestMethod(): String {
        return "really cool, i told you"
    }

    override fun readJsonFile(path: String): String {
        fun go(jsonText: String = ""): String {
            val newString = bufferedReaderWithFilePath.readLine()
            return if (newString == null) {
                jsonText
            } else {
                go(jsonText + newString + "\n")
            }
        }

        bufferedReaderWithFilePath = BufferedReader(FileReader(path))
        return go()
    }

}