package com.example.homework3_7month.presentation.di

import com.example.homework3_7month.domain.usecase.GetAllNotesUseCase
import com.example.homework3_7month.domain.usecase.GetTaskUseCase
import com.example.homework3_7month.domain.usecase.InsertTaskUseCase
import com.example.homework3_7month.domain.usecase.TaskDelete
import com.example.homework3_7month.domain.usecase.UpdateTaskUseCase
import com.example.homework3_7month.presentation.fragments.taskList.TaskViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val uiModule: Module = module {

    factory { TaskViewModel(get(),get(),get(),get(),get()) }
    single { InsertTaskUseCase(get()) }
    single { GetAllNotesUseCase(get()) }
    single { UpdateTaskUseCase(get()) }
    single { TaskDelete(get()) }
    single { GetTaskUseCase(get()) }

}