package com.example.data.json

import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.spyk
import io.mockk.verify
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main(args: Array<String>) {
    val fakeJsonRelativePath = "/data/src/main/assets/test.json"

    //val file = File("").absolutePath
    val projectAbsolutePath = File("").absolutePath
    val testJsonAbsolutePath = projectAbsolutePath + fakeJsonRelativePath
    println(testJsonAbsolutePath)

    val localJson = LocalJson()
    val result = localJson.readJsonFileRecursive(testJsonAbsolutePath)
    println(result)
}

class LocalJsonTest {
    private val localJson = LocalJson()

    private val fakeJsonAbsolutePath by lazy {
        projectAbsolutePath + FAKE_JSON_RELATIVE_PATH
    }

    @MockK
    val mBufferedReader = spyk(BufferedReader(FileReader(fakeJsonAbsolutePath)))

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
        every { localJson.bufferedReader.readLine() } returns "this"

        //Act
        val result = localJson.readJsonFile(fakeJsonAbsolutePath)
        println(result)

        //Assert
        assertTrue(result == FAKE_JSON_CONTENT)
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

        private const val FAKE_JSON_CONTENT = "{
        "'operation_buttons": [
        {
            "title": "Área PIX",
            "icon": "#$90812",
            "background_color": "#FFFFFF",
            "content_description": "[Botão]Toque para menu de transações PIX"
        },
        {
            "title": "Pagar",
            "icon": "#$90812",
            "background_color": "#FFFFFF",
            "description": "[Botão]Toque para pagamentos de boleto"
        },
        {
            "title": "Pegar Emprestado",
            "icon": "#$90812",
            "background_color": "#FFFFFF",
            "description": "[Botão]Toque para empréstimos"
        },
        {
            "title": "Transferir",
            "icon": "#$90812",
            "background_color": "#FFFFFF",
            "description": "[Botão]Toque para realizar uma transferência"
        },
        {
            "title": "Depositar",
            "icon": "#$90812",
            "background_color": "#FFFFFF",
            "description": "[Botão]Toque para realizar um depósito"
        },
        {
            "title": "Recarga de celular",
            "icon": "#$90812",
            "background_color": "#FFFFFF",
            "description": "[Botão]Toque para realizar recarga de celular"
        },
        {
            "title": "Cobrar",
            "icon": "#$90812",
            "background_color": "#FFFFFF",
            "description": "[Botão]Toque para gerar boletos"
        },
        {
            "title": "Doação",
            "icon": "#$90812",
            "background_color": "#FFFFFF",
            "description": "[Botão]Toque para realizar doação"
        },
        {
            "title": "Transferir Internac.",
            "icon": "#$90812",
            "background_color": "#FFFFFF",
            "description": "[Botão]Toque para realizar transferência internacional"
        },
        {
            "title": "Investir",
            "icon": "#$90812",
            "background_color": "#FFFFFF",
            "description": "[Botão]Toque para investir"
        }
        ]
    }"

    }
}