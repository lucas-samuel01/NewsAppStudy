package com.example.newsapp.data.manager

import android.content.Context
import androidx.compose.ui.unit.Constraints
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.example.newsapp.domain.manager.LocalUserManager
import com.example.newsapp.util.Constants
import com.example.newsapp.util.Constants.USER_SETTINGS
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class LocalUserManagerImpl(
    val context:Context
):LocalUserManager {
    override suspend fun saveAppEntry() {
        context.dataStore.edit {
            it[PreferencesKeys.APP_ENTRY] = true
        }
    }

    override fun readAppentry(): Flow<Boolean> {
        return context.dataStore.data.map {
            it[PreferencesKeys.APP_ENTRY]?:false
        }
    }
}
val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = USER_SETTINGS)

private  object PreferencesKeys{
    val APP_ENTRY = booleanPreferencesKey(name = Constants.APP_ENTRY)
}