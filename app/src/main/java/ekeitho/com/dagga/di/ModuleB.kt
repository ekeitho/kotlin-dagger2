package ekeitho.com.dagga.di

import dagger.Module
import dagger.Provides
import ekeitho.com.dagga.pojo.Galaxy
import ekeitho.com.dagga.scopes.ScopeB



@Module class ModuleB() {

    @Provides
    @ScopeB
    fun returnGalaxy() : Galaxy {
        return Galaxy(1000000);
    }
}