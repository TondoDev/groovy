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
    println "-------------"
    generex = new Generex("(7500|0200|1100|0900|6500|1111)000000[0-9]{10}")
    IbanAssembler ibanAss = new IbanAssembler();
    for (int a = 0; a < 5; a++) {
      println ibanAss.assemble("SK", generex.random())
    }
  }
}
