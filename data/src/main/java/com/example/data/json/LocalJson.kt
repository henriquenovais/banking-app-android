package com.example.data.json

import java.io.BufferedReader
import java.io.FileReader

class LocalJson {
    fun readJsonFile(path: String): String {
        var jsonText = ""
        var line: String

        try {
            val bufferedReader = BufferedReader(FileReader(path))

            while (bufferedReader.readLine() != null) {
                line = bufferedReader.readLine()
                jsonText += line + "\n"
            }

            bufferedReader.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return jsonText
    }

    fun readJsonFileRecursive(path: String): String {
        val bufferedReader = BufferedReader(FileReader(path))

        fun go(reader: BufferedReader, jsonText: String = ""): String {
            val newString = reader.readLine()
            return if (newString == null) {
                jsonText
            } else {
                go(reader, jsonText + newString + "\n")
            }
        }

        return go(bufferedReader)
    }

}