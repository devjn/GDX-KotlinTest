package com.jn.arts.test.gdx.desktop

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.jn.arts.test.gdx.GdxMain

/** Launches the desktop (LWJGL) application.  */
object DesktopLauncher {
    @JvmStatic fun main(args: Array<String>) {
        createApplication()
    }

    private fun createApplication() {
        Lwjgl3Application(GdxMain(), defaultConfiguration)

//        Lwjgl3Application(GdxMain(true), defaultConfiguration)
//        val args = arrayOf(Gdx.files.internal("blune.png").file().getAbsolutePath(), Gdx.files.internal("blune.png").file().absolutePath.replace("png", "zktx"),
//                "-etc1", "-RGBA8")
//        KTXProcessor.main(args);
    }

    private val defaultConfiguration: Lwjgl3ApplicationConfiguration
        get() {
            val configuration = Lwjgl3ApplicationConfiguration()
            configuration.setTitle("GDX-KotlinTest")
            configuration.setWindowedMode(1280, 720)
            for (size in intArrayOf(128, 64, 32, 16)) {
                configuration.setWindowIcon("libgdx$size.png")
            }
            return configuration
        }
}