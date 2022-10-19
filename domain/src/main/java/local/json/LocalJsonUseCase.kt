package local.json

interface LocalJsonUseCase {
    fun useLocalJson(path: String) : String
}