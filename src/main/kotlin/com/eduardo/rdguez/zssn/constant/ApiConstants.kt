package com.eduardo.rdguez.zssn.constant

object ApiConstants {
  /* Regex */
  const val LETTERS_REGEX: String = "^[A-Za-zÀ-ÿ ]+$"

  /* Formats */
  const val TWO_DECIMAL_FORMAT: String = "%.2f"

  /* Infection */
  const val REPORTING_LIMIT: Int = 3

  /* Location */
  const val MIN_LATITUDE: String = "-90.0"
  const val MAX_LATITUDE: String = "90.0"
  const val MIN_LONGITUDE: String = "-180.0"
  const val MAX_LONGITUDE: String = "180.0"

  /* Numbers */
  const val ZERO: Int = 0
  const val TWO: Int = 2
  const val FIFTY: Int = 50
  const val ONE_HUNDRED_TWENTY_FIVE: Long = 125
  const val ONE_HUNDRED: Int = 100
}