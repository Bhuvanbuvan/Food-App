package com.appdev.mysplash.domin.manager

import kotlinx.coroutines.flow.Flow

interface LocalUserManager {
    suspend fun SaveDataEntry()
    suspend fun ReadDataEntry():Flow<Boolean>
}