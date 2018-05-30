package rpg

import java.security.SecureRandom
import java.util.*

private val rnd = SecureRandom(UUID.randomUUID().toString().toByteArray())

fun roll(die: IntRange) = (rnd.nextInt(die.last) + 1)

val Int.modifier: Int
  get() = when (this) {
    1         -> -5
    in 2..3   -> -4
    in 4..5   -> -3
    in 6..7   -> -2
    in 8..9   -> -1
    in 10..11 -> 0
    in 12..13 -> +1
    in 14..15 -> +2
    in 16..17 -> +3
    in 18..19 -> +4
    in 20..21 -> +5
    in 22..23 -> +6
    in 24..25 -> +7
    in 26..27 -> +8
    in 28..29 -> +9
    30        -> +10
    else      -> throw IllegalStateException("attribute out of range: ${this}")
  }