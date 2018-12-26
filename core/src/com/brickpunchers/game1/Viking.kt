package com.brickpunchers.game1

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector2

class Viking: GameObject
{
    val img: Texture = Texture("badlogic.jpg")
    var pos: Vector2 = Vector2()

    override fun coords(): Vector2
    {
        return pos
    }

    override fun act(gameObjects: List<GameObject>): List<GameObject>
    {
        if (pos.x > 100)
        {
            pos.x = 0f
        }
        if (pos.y > 100)
        {
            pos.y = 0f
        }
        pos.x += 1
        pos.y += 1

        return gameObjects
    }

    override fun draw(batch: SpriteBatch)
    {
        batch.draw(img, pos.x, pos.y)
    }

}