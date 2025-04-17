package com.ihsanarslan.simpledependencyinjectionexample.di

import com.ihsanarslan.simpledependencyinjectionexample.data.repository.Repository
import com.ihsanarslan.simpledependencyinjectionexample.data.repository.Repository2
import com.ihsanarslan.simpledependencyinjectionexample.domain.repository.Repository2Impl
import com.ihsanarslan.simpledependencyinjectionexample.domain.repository.RepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(): Repository {
        return RepositoryImpl()
    }

    @Singleton
    @Provides
    fun provideRepository2(): Repository2 {
        return Repository2Impl()
    }

}