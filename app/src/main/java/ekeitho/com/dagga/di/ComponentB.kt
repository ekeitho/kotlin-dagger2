package ekeitho.com.dagga.di

import dagger.Subcomponent
import ekeitho.com.dagga.ActivityB
import ekeitho.com.dagga.scopes.ScopeB

@ScopeB
@Subcomponent(modules = arrayOf(ModuleB::class))
public interface ComponentB {
    fun inject(activity : ActivityB)
}
