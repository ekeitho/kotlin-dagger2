package ekeitho.com.dagga

import android.app.Application
import ekeitho.com.dagga.di.ApplicationComponent
import ekeitho.com.dagga.di.DaggerApplicationComponent


class MyApplication : Application() {


    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.create()
    }
}
