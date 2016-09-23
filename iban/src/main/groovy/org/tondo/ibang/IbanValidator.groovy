class IbanValidator {

  int MAX_LENGTH = 34

  // just guessing  2(country) + 2 (checksumm) + 4 (BBAN)
  int MIN_LENGTH = 8
  void validate(String iban) {
    int len = (iban?: "").length()
    if (len < MIN_LENGTH || len > MAX_LENGTH)  {
      throw new IbanException("${len} is not valid iban length")
    }

    String syntaxValidationRegexp = "^[A-Z]{2}[0-9]{2}[A-Z0-9]{4,}"

    String upperCaseIban = iban.toUpperCase()
    if(!upperCaseIban.matches(syntaxValidationRegexp)) {
      throw new IbanException("${iban} is not in valid format")
    }

    // slicing indices are inclusive
    String countryCode = upperCaseIban[0..1]
    byte checksum = upperCaseIban[2..3].toInteger()
    String account = upperCaseIban.substring(4)

    println "${countryCode} ${checksum} ${account}"

    String repositioned = account + countryCode + checksum
    String replacedCharacters = new CharacterCodec().encodeLetters(repositioned)

    println replacedCharacters
    if (new BigInteger(replacedCharacters).mod(BigInteger.valueOf(97))
            .intValue() != 1)  {
          throw new IbanException("Invalid checksum for ${iban}")
    }

  } // end of method
}
