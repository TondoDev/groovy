package org.tondo.ibang

class IbanAssembler {

  String generate() {
    // get country specific length
    // sample number: SK30 7300 0000 0090 0004 0409
    String country = "SK"
    String bban = "73000000009000040409"

    return assemble(country, bban)
  }

  String assemble(String country, String bban) {
    int checksum = calculateChecksum(country, bban)
    // checksum must have two digits
    return country + (checksum < 10 ? "0" + checksum : checksum) + bban
  }

  int calculateChecksum(String country, String bban) {
    String encoded = new CharacterCodec().encodeLetters(bban + country + "00")
    BigInteger number = new BigInteger(encoded)
    int reminder = number.mod(BigInteger.valueOf(97)).intValue()
    return  98 - reminder
  }
}
