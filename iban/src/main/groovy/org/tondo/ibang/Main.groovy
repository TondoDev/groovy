package org.tondo.ibang

import org.tondo.iban.Hallo

class Main {

  static void main(String[] args) {
  //  println args[0]
  //  new IbanValidator().validate(args[0])

  println new IbanAssembler().generate()
  }
}
