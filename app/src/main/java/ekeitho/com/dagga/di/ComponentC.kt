package ekeitho.com.dagga.di

import dagger.Subcomponent
import ekeitho.com.dagga.ActivityC
import ekeitho.com.dagga.scopes.ScopeC

@ScopeC
@Subcomponent(modules = arrayOf(ModuleC::class))
public interface ComponentC {
    fun inject(activity : ActivityC)
}
