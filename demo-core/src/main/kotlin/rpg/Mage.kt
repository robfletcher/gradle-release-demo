package rpg

data class Mage(
  override val name: String,
  override val strength: Int,
  override val dexterity: Int,
  override val constitution: Int,
  override val intelligence: Int,
  override val wisdom: Int,
  override val charisma: Int,
  override val alignment: Alignment
) : BaseCharacterClass(1..6) {
  private val _spells = mutableSetOf<String>()
  val spells: Set<String>
    get() = _spells

  fun learn(spell: String) {
    _spells.add(spell)
  }
}