package com.stanete.schwifty.features.characters.renderers

import com.stanete.schwifty.R
import com.stanete.schwifty.core.renderer.Renderer
import kotlinx.android.synthetic.main.renderer_character.tvName

class CharacterRenderer : Renderer<CharacterRenderable>() {

  override val layoutId: Int
    get() = R.layout.renderer_character

  override fun render() {
    tvName.text = content.character.name
  }
}