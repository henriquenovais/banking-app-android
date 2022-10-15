package com.example.data.json

import io.mockk.verify
import org.junit.Before
import org.junit.Test
import org.junit.internal.Classes.getClass
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.Exception
import java.nio.file.FileSystems
import kotlin.coroutines.coroutineContext

fun main(args: Array<String>) {
    val fakeJsonRelativePath = "/data/src/main/assets/test.json"

    //val file = File("").absolutePath
    val projectAbsolutePath = File("").absolutePath
    val testJsonAbsolutePath = projectAbsolutePath + fakeJsonRelativePath
    println(testJsonAbsolutePath)
}

class LocalJsonTest {
    val localJson = LocalJson()

    val mBufferedReader by lazy {
        BufferedReader(FileReader(fakeJsonAbsolutePath))
    }
    /*
        val fakeJsonPath = getClass(this.toString()).classLoader!!.getResource("test.json").path
    */


    @Before
    fun testSetup() {
        localJson.bufferedReader = mBufferedReader
    }

    @Test
    fun readJsonFile() {
        //Arrange

        //Act

        //Assert
    }

    @Test
    fun readJsonFileRecursive() {
        //Arrange
        //Act
        //Assert
    }

    companion object {
        private val projectAbsolutePath = File("").absolutePath
        private const val FAKE_JSON_RELATIVE_PATH = "/src/main/assets/test.json"
        private val fakeJsonAbsolutePath = projectAbsolutePath + FAKE_JSON_RELATIVE_PATH
    }
}