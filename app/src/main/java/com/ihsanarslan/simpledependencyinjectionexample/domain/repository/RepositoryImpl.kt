package com.ihsanarslan.simpledependencyinjectionexample.domain.repository

import com.ihsanarslan.simpledependencyinjectionexample.data.repository.Repository
import javax.inject.Inject

class RepositoryImpl : Repository {

    override fun getData(): String {
        return "deneme yazısı"
    }

}