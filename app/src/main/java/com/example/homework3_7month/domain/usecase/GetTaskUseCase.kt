package com.example.homework3_7month.domain.usecase

import com.example.homework3_7month.domain.model.TaskModel
import com.example.homework3_7month.domain.repository.TaskManagerRepository

class GetTaskUseCase(
    private val taskManagerRepository: TaskManagerRepository) {

    suspend operator fun invoke(id:Int):TaskModel?{
        return taskManagerRepository.getTask(id)
    }
}