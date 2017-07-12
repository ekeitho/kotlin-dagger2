package ekeitho.com.dagga.di


import dagger.Module
import dagger.Provides
import ekeitho.com.dagga.pojo.Animal
import ekeitho.com.dagga.scopes.ScopeA

@Module class ModuleA() {

    @ScopeA
    @Provides
    fun returnAnimal() : Animal {
        return Animal("rocky", "dinosaur")
    }
}
