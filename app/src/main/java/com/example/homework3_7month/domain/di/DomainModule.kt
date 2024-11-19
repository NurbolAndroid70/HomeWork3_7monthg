package com.example.homework3_7month.domain.di

import com.example.homework3_7month.domain.usecase.GetAllNotesUseCase
import com.example.homework3_7month.domain.usecase.GetTaskUseCase
import com.example.homework3_7month.domain.usecase.InsertTaskUseCase
import com.example.homework3_7month.domain.usecase.TaskDelete
import com.example.homework3_7month.domain.usecase.UpdateTaskUseCase
import org.koin.core.module.Module
import org.koin.dsl.module

val domainModule: Module = module {

    factory { InsertTaskUseCase(get()) }
    single { UpdateTaskUseCase(get()) }
    single { GetAllNotesUseCase(get()) }
    single { TaskDelete(get()) }
    single { GetTaskUseCase(get()) }
}