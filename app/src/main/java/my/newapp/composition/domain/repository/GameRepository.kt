package my.newapp.composition.domain.repository

import my.newapp.composition.domain.entity.GameSettings
import my.newapp.composition.domain.entity.Level
import my.newapp.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}