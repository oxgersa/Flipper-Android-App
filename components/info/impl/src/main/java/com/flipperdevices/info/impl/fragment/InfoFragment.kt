package com.flipperdevices.info.impl.fragment

import android.os.Bundle
import androidx.compose.runtime.Composable
import com.flipperdevices.core.di.ComponentHolder
import com.flipperdevices.core.ui.fragment.ComposeFragment
import com.flipperdevices.core.ui.res.R as DesignSystem
import com.flipperdevices.info.impl.compose.ComposableDeviceInfoScreen
import com.flipperdevices.info.impl.di.InfoComponent
import com.flipperdevices.updater.api.UpdaterCardApi
import javax.inject.Inject

class InfoFragment : ComposeFragment() {
    @Inject
    lateinit var updaterCardApi: UpdaterCardApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ComponentHolder.component<InfoComponent>().inject(this)
    }

    @Composable
    override fun RenderView() {
        ComposableDeviceInfoScreen(updaterCardApi)
    }

    override fun getStatusBarColor(): Int = DesignSystem.color.accent
}