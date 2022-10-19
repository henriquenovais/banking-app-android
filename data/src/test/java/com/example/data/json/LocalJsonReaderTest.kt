package com.example.data.json

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.spyk
import io.mockk.verify
import org.junit.Before
import org.junit.Test
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import kotlin.test.assertTrue

//fun main(args: Array<String>) {
//    val fakeJsonRelativePath = "/data/src/main/assets/test.json"
//
//    //val file = File("").absolutePath
//    val projectAbsolutePath = File("").absolutePath
//    val testJsonAbsolutePath = projectAbsolutePath + fakeJsonRelativePath
//    println(testJsonAbsolutePath)
//
//    val localJsonReader = LocalJsonReader()
//    val result = localJsonReader.readJsonFileRecursive(testJsonAbsolutePath)
//    println(result)
//}

class LocalJsonReaderTest {

    private val fakeJsonAbsolutePath = projectAbsolutePath + FAKE_JSON_RELATIVE_PATH

    @MockK
    lateinit var mBufferedReader: BufferedReader

    private val localJsonReader by lazy {
        LocalJsonReader(mBufferedReader)
    }

    @Before
    fun testSetup() {
        localJsonReader.setJsonFilePath(fakeJsonAbsolutePath)
        every {mBufferedReader.readLine()} returns "this"
        MockKAnnotations.init(this, relaxed = true)
    }

    @Test
    fun readJsonFile() {
        //Arrange

        //Act
        val result = localJsonReader.readJsonFile()
        println(result)

        //Assert
        assertTrue(result.contains(FAKE_JSON_CONTENT))
    }

    @Test
    fun readJsonFileRecursive() {
        //Arrange

        //Act
        val result = localJsonReader.readJsonFileRecursive()

        //Assert
        assertTrue(result.contains(FAKE_JSON_CONTENT))
    }

    companion object {
        private val projectAbsolutePath = File("").absolutePath
        private const val FAKE_JSON_RELATIVE_PATH = "/src/main/assets/test.json"

        private const val FAKE_JSON_CONTENT = "{\n" +
                "  \"operation_buttons\": [\n" +
                "    {\n" +
                "      \"title\": \"Área PIX\",\n" +
                "      \"icon\": \"#\$90812\",\n" +
                "      \"background_color\": \"#FFFFFF\",\n" +
                "      \"content_description\": \"[Botão]Toque para menu de transações PIX\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Pagar\",\n" +
                "      \"icon\": \"#\$90812\",\n" +
                "      \"background_color\": \"#FFFFFF\",\n" +
                "      \"description\": \"[Botão]Toque para pagamentos de boleto\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Pegar Emprestado\",\n" +
                "      \"icon\": \"#\$90812\",\n" +
                "      \"background_color\": \"#FFFFFF\",\n" +
                "      \"description\": \"[Botão]Toque para empréstimos\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Transferir\",\n" +
                "      \"icon\": \"#\$90812\",\n" +
                "      \"background_color\": \"#FFFFFF\",\n" +
                "      \"description\": \"[Botão]Toque para realizar uma transferência\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Depositar\",\n" +
                "      \"icon\": \"#\$90812\",\n" +
                "      \"background_color\": \"#FFFFFF\",\n" +
                "      \"description\": \"[Botão]Toque para realizar um depósito\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Recarga de celular\",\n" +
                "      \"icon\": \"#\$90812\",\n" +
                "      \"background_color\": \"#FFFFFF\",\n" +
                "      \"description\": \"[Botão]Toque para realizar recarga de celular\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Cobrar\",\n" +
                "      \"icon\": \"#\$90812\",\n" +
                "      \"background_color\": \"#FFFFFF\",\n" +
                "      \"description\": \"[Botão]Toque para gerar boletos\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Doação\",\n" +
                "      \"icon\": \"#\$90812\",\n" +
                "      \"background_color\": \"#FFFFFF\",\n" +
                "      \"description\": \"[Botão]Toque para realizar doação\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Transferir Internac.\",\n" +
                "      \"icon\": \"#\$90812\",\n" +
                "      \"background_color\": \"#FFFFFF\",\n" +
                "      \"description\": \"[Botão]Toque para realizar transferência internacional\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Investir\",\n" +
                "      \"icon\": \"#\$90812\",\n" +
                "      \"background_color\": \"#FFFFFF\",\n" +
                "      \"description\": \"[Botão]Toque para investir\"\n" +
                "    }\n" +
                "  ]\n" +
                "}"

    }
}