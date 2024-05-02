package com.appdev.mysplash.presentation.onbording

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appdev.mysplash.domin.manager.LocalUserManager
import com.appdev.mysplash.domin.usecases.AppEntryUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnbordingViewModdel @Inject constructor(
private val useCases: AppEntryUseCases
):ViewModel() {
    fun onEvent(event: OnbordingEvent){
        when(event){
            is OnbordingEvent.saveAppEntry ->{
                saveappEntry()
            }
        }
    }

    private fun saveappEntry() {
        viewModelScope.launch {
            useCases.saveDataEntryUseCase()
        }
    }
}