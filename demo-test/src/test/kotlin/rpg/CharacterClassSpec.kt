package rpg

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

abstract class CharacterClassSpec<T : Character> {

  abstract fun subject(): T
  abstract val hitDice: IntRange

  @Test
  fun `starts with base hit points`() {
    subject().let { character ->
      assertEquals(hitDice.last, character.baseHitPoints)
    }
  }

  @Test
  fun `levelling up adds hit points`() {
    subject().let { character ->
      character.levelUp()
      assertTrue(character.baseHitPoints > hitDice.last)
      assertTrue(character.baseHitPoints <= hitDice.last * 2)
    }
  }
}