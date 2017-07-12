package ekeitho.com.dagga.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
public interface ApplicationComponent {
    fun plusA(moduleA: ModuleA) : ComponentA
    fun plusB(moduleB: ModuleB) : ComponentB
    fun plusC(moduleC: ModuleC) : ComponentC
}