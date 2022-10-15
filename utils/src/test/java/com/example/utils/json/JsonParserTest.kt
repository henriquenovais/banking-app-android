package com.example.utils.json

import io.mockk.every
import io.mockk.verify
import org.junit.Assert.*

import org.junit.Test

class JsonParserTest {

    val jsonParser = JsonParser()

//    @Test
//    fun openJsonFile() {
//        //Arrange
//       // every { /*odd java command to open*/ } returns FAKE_STRING
//
//        //Act
//        val result = jsonParser.openJsonFile(FAKE_PATH)
//
//        //Assert
//        verify (exactly = 1) {
//            //odd java command called
//        }
//    }

    companion object{
        const val FAKE_PATH = "fake/path/to/no/location"
        const val FAKE_STRING = "jsoninformationfromfile"
    }
}