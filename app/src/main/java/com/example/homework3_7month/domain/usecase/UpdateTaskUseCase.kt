package com.example.homework3_7month.domain.usecase

import com.example.homework3_7month.domain.model.TaskModel
import com.example.homework3_7month.domain.repository.TaskManagerRepository
import com.example.homework3_7month.presentation.model.TaskUI
import com.example.homework3_7month.presentation.model.toDomain

class UpdateTaskUseCase(private val taskRepository: TaskManagerRepository) {

    suspend fun updateTask(taskModel: TaskModel): String {
        return try {
            taskRepository.updateTask(taskModel)
            "Все Гуд"
        } catch (e: Exception) {
            "Ошибка : ${e.message}"
        }
    }
}