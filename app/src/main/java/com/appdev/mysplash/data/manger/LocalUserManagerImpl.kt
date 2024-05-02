package com.appdev.mysplash.data.manger

import android.content.Context
import android.preference.PreferenceDataStore
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.appdev.mysplash.domin.manager.LocalUserManager
import com.appdev.mysplash.util.Constants.APPENTRY
import com.appdev.mysplash.util.Constants.PREFERENCE
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class LocalUserManagerImpl(
    private val context: Context
) :LocalUserManager{
    override suspend fun SaveDataEntry() {
        context.ds.edit {value->
            value[preferencekey.app_entry]=true
        }
    }

    override suspend fun ReadDataEntry(): Flow<Boolean> {
        return context.ds.data.map {value->
            value[preferencekey.app_entry]?:false
        }
    }

}

private val Context.ds :DataStore<Preferences> by preferencesDataStore(name = PREFERENCE)

object preferencekey{
    val app_entry= booleanPreferencesKey(APPENTRY)
}