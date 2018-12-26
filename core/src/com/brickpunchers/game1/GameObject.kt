package com.brickpunchers.game1

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector2

interface GameObject
{
    fun coords(): Vector2

    fun act(gameObjects: List<GameObject>): List<GameObject>

    fun draw(batch: SpriteBatch)
}