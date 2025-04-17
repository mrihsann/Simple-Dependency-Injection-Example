package com.ihsanarslan.simpledependencyinjectionexample.domain.usecase

import com.ihsanarslan.simpledependencyinjectionexample.data.repository.Repository
import javax.inject.Inject

class GetDataUseCase @Inject constructor(
    private val repository: Repository
) {
    operator fun invoke(): String {
        return repository.getData()
    }
}