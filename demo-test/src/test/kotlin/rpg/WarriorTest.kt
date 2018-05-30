package rpg

class WarriorTest : CharacterClassSpec<Warrior>() {
  override fun subject() =
    Warrior("Thor", 10, 10, 10, 10, 10, 10, Alignment.NEUTRAL)

  override val hitDice = 1..10
}