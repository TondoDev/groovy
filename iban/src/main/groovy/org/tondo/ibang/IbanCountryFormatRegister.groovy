class IbanCountryFormatRegister {

  private Map register = [:]
  void register(String countryCode, String formatRegexp) {
    validateEntry(countryCode, formatRegexp)
    register[countryCode] = formatRegexp
  }

  String getFormat(String countryCode) {
    return register[countryCode]
  }


  private validateEntry(String countryCode, String formatRegexp) {

  }
}
