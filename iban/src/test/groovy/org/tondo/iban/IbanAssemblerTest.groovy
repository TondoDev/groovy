package org.tondo.iban

import org.tondo.ibang.IbanAssembler
import spock.lang.*


class IbanAssemblerTest extends Specification {

  IbanAssembler iban = new IbanAssembler()

  def "test generate iban from contry code and BBAN"() {
    expect :
      result == iban.assemble(code, bban)
    where :
      code <<   ["SK",                        "CZ",                         "DE"]
      bban <<   ["73000000009000040409",      "00000000000002667001",       "500105170648489890"]
      result << ["SK3073000000009000040409",  "CZ6900000000000002667001",   "DE12500105170648489890"]
  }
}
