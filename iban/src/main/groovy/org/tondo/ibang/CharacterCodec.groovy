class CharacterCodec {

  String encodeLetters(String ibanString) {
    ibanString.toUpperCase().collectReplacements{
      if (it.isLetter()) {
        // A = 10, B = 11,..., Z = 35
        (((int)it -(int)'A') + 10).toString()
      } else {
        it.toString()
      }
    }
  }
}
