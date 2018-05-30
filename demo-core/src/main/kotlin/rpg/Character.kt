package rpg

interface Character {
  val name: String

  val strength: Int
  val dexterity: Int
  val constitution: Int
  val intelligence: Int
  val wisdom: Int
  val charisma: Int

  val alignment: Alignment
  val characterClass: String

  val level: Int
  val baseHitPoints: Int
  val remainingHitPoints: Int
  fun damage(hitPoints: Int)
  fun heal(hitPoints: Int)
  fun levelUp()
}
