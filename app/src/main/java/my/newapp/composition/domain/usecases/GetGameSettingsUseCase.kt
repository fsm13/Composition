package my.newapp.composition.domain.usecases

import my.newapp.composition.domain.entity.GameSettings
import my.newapp.composition.domain.entity.Level
import my.newapp.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}