package ekeitho.com.dagga.di

import dagger.Subcomponent
import ekeitho.com.dagga.ActivityA
import ekeitho.com.dagga.scopes.ScopeA


@ScopeA
@Subcomponent(modules = arrayOf(ModuleA::class))
public interface ComponentA {
    fun inject(activity : ActivityA)
}
