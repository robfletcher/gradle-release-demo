package rpg.ext

import rpg.Alignment
import rpg.BaseCharacterClass

data class Valkyrie(
  override val name: String,
  override val strength: Int,
  override val dexterity: Int,
  override val constitution: Int,
  override val intelligence: Int,
  override val wisdom: Int,
  override val charisma: Int,
  override val alignment: Alignment
) : BaseCharacterClass(1..8)