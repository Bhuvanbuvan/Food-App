package com.appdev.mysplash.di

import android.app.Application
import com.appdev.mysplash.data.manger.LocalUserManagerImpl
import com.appdev.mysplash.domin.manager.LocalUserManager
import com.appdev.mysplash.domin.usecases.AppEntryUseCases
import com.appdev.mysplash.domin.usecases.ReadDataEntryUseCase
import com.appdev.mysplash.domin.usecases.SaveDataEntryUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Model {
    @Provides
    @Singleton
    fun provideLocalManager(application: Application):LocalUserManager{
        return LocalUserManagerImpl(application)
    }

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    )= AppEntryUseCases(
            saveDataEntryUseCase = SaveDataEntryUseCase(localUserManager),
            readDataEntryUseCase = ReadDataEntryUseCase(localUserManager)
        )


}