package com.ihsanarslan.simpledependencyinjectionexample.domain.usecase

import com.ihsanarslan.simpledependencyinjectionexample.data.repository.Repository2
import javax.inject.Inject

class SetDataUseCase @Inject constructor(
    private val repository: Repository2
) {
    operator fun invoke(data: String) {
        return repository.setData(data)
    }
}