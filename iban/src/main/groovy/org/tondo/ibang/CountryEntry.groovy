package org.tondo.ibang

class CountryEntry {

  String countryShort
  String country
  int bbanLength
  String accountPattern

  Map bankCodePrefixMapping

  public CountryEntry(String code, int bbanLen, String accountPattern) {
    this.countryShort = code
    this.bbanLength = bbanLen
    this.accountPattern = accountPattern
  }
}
