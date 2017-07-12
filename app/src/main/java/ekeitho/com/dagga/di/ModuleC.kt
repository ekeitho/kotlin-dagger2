package ekeitho.com.dagga.di

import dagger.Module
import dagger.Provides
import ekeitho.com.dagga.pojo.Person
import ekeitho.com.dagga.scopes.ScopeC

@Module class ModuleC() {

    @Provides
    @ScopeC
    fun returnPerson() : Person {
        return Person(21, "jim")
    }
}