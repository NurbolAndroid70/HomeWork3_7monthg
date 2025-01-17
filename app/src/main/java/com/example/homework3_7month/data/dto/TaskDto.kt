package com.example.homework3_7month.data.dto

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.homework3_7month.domain.model.TaskModel

@Entity
data class TaskDto(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val taskName:String? = null,
    val taskDate:String? = null,
    val taskPhoto:String? = null
)

fun TaskModel.toData() = TaskDto(id,taskName,taskDate,taskPhoto)
fun TaskDto.toDomain() = TaskModel(id,taskName.orEmpty(),taskDate.orEmpty(),taskPhoto.orEmpty())