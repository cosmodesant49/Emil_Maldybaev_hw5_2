package com.geeks.emil_maldybaev_hw5_2.di

import android.content.Context
import android.content.SharedPreferences
import com.geeks.emil_maldybaev_hw5_2.Hero
import com.geeks.emil_maldybaev_hw5_2.Utils
import com.geeks.emil_maldybaev_hw5_2.data.local.Pref
import com.geeks.emil_maldybaev_hw5_2.model.LoveApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun provideApi():LoveApi{
        return  Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com")
            .addConverterFactory(GsonConverterFactory.create()).build().create(LoveApi::class.java)

    }
    @Provides
    fun provideUtils():Utils{
        return Utils()
    }
    @Provides
    fun provideHero(): Hero {
        return Hero()
    }
    //        var a = getSharedPreferences("fileName",Context.MODE_PRIVATE)
    @Provides
    fun providePreferences(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences("fileName",Context.MODE_PRIVATE)
    }

    @Provides
    fun providePref(sharedPreferences: SharedPreferences):Pref{
        return Pref(sharedPreferences)
    }
}