package com.ihsanarslan.simpledependencyinjectionexample.di

import com.ihsanarslan.simpledependencyinjectionexample.data.repository.Repository
import com.ihsanarslan.simpledependencyinjectionexample.data.repository.Repository2
import com.ihsanarslan.simpledependencyinjectionexample.domain.usecase.GetDataUseCase
import com.ihsanarslan.simpledependencyinjectionexample.domain.usecase.SetDataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideSetDataUseCase(repository: Repository2): SetDataUseCase {
        return SetDataUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideGetDataUseCase(repository: Repository): GetDataUseCase {
        return GetDataUseCase(repository)
    }

}