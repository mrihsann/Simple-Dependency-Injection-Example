package com.ihsanarslan.simpledependencyinjectionexample.presentation

import androidx.lifecycle.ViewModel
import com.ihsanarslan.simpledependencyinjectionexample.data.repository.Repository
import com.ihsanarslan.simpledependencyinjectionexample.domain.usecase.GetDataUseCase
import com.ihsanarslan.simpledependencyinjectionexample.domain.usecase.SetDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val getDataUseCase: GetDataUseCase,
    private val setDataUseCase: SetDataUseCase
) : ViewModel() {

    fun loadData(): String {
        return getDataUseCase()
    }

    fun setData(data: String) {
        setDataUseCase(data)
    }

}