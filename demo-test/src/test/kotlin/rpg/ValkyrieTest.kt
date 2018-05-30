package rpg

import rpg.ext.Valkyrie

class ValkyrieTest:CharacterClassSpec<Valkyrie>() {
  override fun subject() =
    Valkyrie("Thyra", 10, 10, 10, 10, 10, 10, Alignment.LAWFUL_NEUTRAL)

  override val hitDice = 1..8
}