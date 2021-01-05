package com.aks.test4dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    @Provides
    Water provideWater(){
        return new Water();
    }


    @Provides
    Water provideWater(){
        return new Water();
    }



}
