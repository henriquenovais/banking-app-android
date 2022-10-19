package json

import com.example.data.json.LocalJsonRepository

class LocalJsonUseCaseImpl (private val localJsonRepository: LocalJsonRepository) : LocalJsonUseCase {
    override fun useLocalJson(path: String) : String{
        return localJsonRepository.readJsonFile(path)
    }
}