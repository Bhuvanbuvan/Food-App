package com.appdev.mysplash.domin.usecases

import com.appdev.mysplash.domin.manager.LocalUserManager

class SaveDataEntryUseCase(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke(){
        localUserManager.SaveDataEntry()
    }
}