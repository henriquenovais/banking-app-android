package com.example.data.json

import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import org.junit.Before
import org.junit.Test
import java.io.BufferedReader
import java.io.File
import java.io.FileNotFoundException
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class LocalJsonRepositoryImplTest {

    @MockK
    lateinit var mBufferedReader: BufferedReader

    private val localJsonRepositoryImpl by lazy {
        LocalJsonRepositoryImpl(mBufferedReader)
    }

    @Before
    fun testSetup() {
        MockKAnnotations.init(this, relaxed = true)
    }

    @Test
    fun readJsonFile() {
        //Arrange
        val fakeJsonAbsolutePath = projectAbsolutePath + FAKE_JSON_RELATIVE_PATH

        //Act
        val result = localJsonRepositoryImpl.readJsonFile(fakeJsonAbsolutePath)

        //Assert
        assertTrue(result.contains(FAKE_JSON_CONTENT))
    }

    @Test
    fun readJsonFileRecursive() {
        //Arrange
        val fakeJsonAbsolutePath = projectAbsolutePath + FAKE_JSON_RELATIVE_PATH

        //Act
        val result = localJsonRepositoryImpl.readJsonFile(fakeJsonAbsolutePath)

        //Assert
        assertTrue(result.contains(FAKE_JSON_CONTENT))
    }

    @Test
    fun readJsonFileRecursiveHaha() {
        //Arrange
        val fakeBugJsonAbsolutePath = projectAbsolutePath + FAKE_BUG_JSON_RELATIVE_PATH

        //Act

        //Assert
        assertFailsWith(FileNotFoundException::class){ localJsonRepositoryImpl.readJsonFile(fakeBugJsonAbsolutePath) }
    }

    companion object {
        val projectAbsolutePath = File("").absolutePath
        const val FAKE_JSON_RELATIVE_PATH = "/src/main/assets/test.json"
        const val FAKE_BUG_JSON_RELATIVE_PATH = "/src/main/assets/bugtest.json"

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