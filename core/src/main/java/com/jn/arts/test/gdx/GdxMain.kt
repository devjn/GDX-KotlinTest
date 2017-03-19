package com.jn.arts.test.gdx

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class GdxMain() : ApplicationAdapter() {
    private lateinit var batch: SpriteBatch
    private lateinit var image: Texture
    private var etc1Image: Texture? = null
    private var etc2Image: Texture? = null
    var testing = false

    constructor(testing: Boolean) : this() {
        this.testing = testing
    } // either super() or delegate to another constructor


    override fun create() {
        batch = SpriteBatch()
        image = Texture("badlogic.png")
        if(Gdx.files.internal("blune.zktx").exists() && Gdx.files.internal("blune-RGBA8.zktx").exists()) {
            etc1Image = Texture(Gdx.files.internal("blune.zktx"))
            etc2Image = Texture(Gdx.files.internal("blune-RGBA8.zktx"))
        }
    }

    override fun render() {
        if(testing) return
        Gdx.gl.glClearColor(1f, 1f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.begin()
        batch.draw(image, 165f, 180f)
        etc1Image?: batch.draw(etc1Image, 50f, 300f)
        etc2Image?: batch.draw(etc2Image, 350f, 300f)
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
        image.dispose()
    }
}