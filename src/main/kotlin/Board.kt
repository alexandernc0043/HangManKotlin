package com.github.alexandernc0043

enum class Board(val stage: String) {
    Inital("""
   +--+
   |  |
      |
      |
      |
      |
  =====
    """.trimIndent()),
    STAGE_ONE("""\
   +--+
   |  |
   O  |
      |
      |
      |
  ====="
    """.trimIndent()),
    STAGE_TWO("""
   +--+
   |  |
   O  |
   |  |
      |
      |
  =====
    """.trimIndent()),
    STAGE_THREE("""
   +--+
   |  |
   O  |
  /|  |
      |
      |
  =====
    """.trimIndent()),
    STAGE_FOUR("""
   +--+
   |  |
   O  |
  /|\ |
      |
      |
  =====
    """.trimIndent()),
    STAGE_FIVE("""
   +--+
   |  |
   O  |
  /|\ |
  /   |
      |
  =====
""".trimIndent()),
    LOST("""
   +--+
   |  |
   O  |
  /|\ |
  / \ |
      |
  =====
    """.trimIndent())
}