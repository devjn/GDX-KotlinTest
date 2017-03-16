package com.jn.arts.test.gdx.desktop

import com.badlogic.gdx.Files.FileType
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.jn.arts.test.gdx.GdxMain

/** Launches the desktop (LWJGL) application.  */
object DesktopLauncher {
    @JvmStatic fun main(args: Array<String>) {
        createApplication()
    }

    private fun createApplication(): LwjglApplication {
        return LwjglApplication(GdxMain(), defaultConfiguration)
    }

    private val defaultConfiguration: LwjglApplicationConfiguration
        get() {
            val configuration = LwjglApplicationConfiguration()
            configuration.title = "GDX-KotlinTest"
            configuration.width = 1280
            configuration.height = 720
            for (size in intArrayOf(128, 64, 32, 16)) {
                configuration.addIcon("libgdx$size.png", FileType.Internal)
            }
            return configuration
        }
}