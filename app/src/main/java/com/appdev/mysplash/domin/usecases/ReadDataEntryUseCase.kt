package com.appdev.mysplash.domin.usecases

import com.appdev.mysplash.domin.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadDataEntryUseCase(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke():Flow<Boolean>{
        return localUserManager.ReadDataEntry()
    }
}