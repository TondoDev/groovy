package org.tondo.ibang

import org.tondo.iban.Hallo
import com.mifmif.common.regex.Generex

class Main {

  static void main(String[] args) {
  //  println args[0]
  //  new IbanValidator().validate(args[0])

    println new IbanAssembler().generate()
    Generex generex = new Generex("[0-3]([a-c]|[e-g]{1,2})")
    for (int a = 0; a < 5; a++) {
      println generex.random()
    }
    println "----"
    generex = new Generex("[0-3]([a-c]|[e-g]{1,2})")
    for (int a = 0; a < 5; a++) {
      println generex.random()
    }
  }
}
