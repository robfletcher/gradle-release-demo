package rpg

abstract class BaseCharacterClass(
  private val hitDice: IntRange
) : Character {
  override val characterClass: String = javaClass.simpleName

  private var _level: Int = 1
  override val level: Int
    get() = _level

  private var _baseHitPoints: Int = hitDice.last
  override val baseHitPoints: Int
    get() = _baseHitPoints + (constitution.modifier * level)

  private var _remainingHitPoints: Int = _baseHitPoints
  override val remainingHitPoints: Int
    get() = _remainingHitPoints

  override fun damage(hitPoints: Int) {
    _remainingHitPoints = Math.max(_remainingHitPoints - hitPoints, 0)
  }

  override fun heal(hitPoints: Int) {
    _remainingHitPoints = Math.min(_remainingHitPoints + hitPoints, baseHitPoints)
  }

  override fun levelUp() {
    _level++
    _baseHitPoints += roll(hitDice)
  }
}