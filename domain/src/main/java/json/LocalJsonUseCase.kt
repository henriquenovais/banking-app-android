package json

import com.example.data.json.LocalJsonRepository

interface LocalJsonUseCase {
    fun useLocalJson(path: String) : String
}