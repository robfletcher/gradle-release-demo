package rpg

class MageTest : CharacterClassSpec<Mage>() {
  override fun subject() =
    Mage("Merlin", 10, 10, 10, 10, 10, 10, Alignment.CHAOTIC_GOOD)

  override val hitDice = 1..6
}