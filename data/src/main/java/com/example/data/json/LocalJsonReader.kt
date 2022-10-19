package com.example.data.json

import java.io.BufferedReader
import java.io.FileReader

class LocalJsonReader(private var bufferedReaderWithFilePath: BufferedReader) {

    fun readJsonFile(path: String): String {
        bufferedReaderWithFilePath = BufferedReader(FileReader(path))
        var jsonText = ""
        var line: String

        try {
            while (true) {
                line = bufferedReaderWithFilePath.readLine()
                if(line == null){
                    break
                } else {
                    jsonText += line + "\n"
                }
            }
            bufferedReaderWithFilePath.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return jsonText
    }

    fun readJsonFileRecursive(path: String): String {
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