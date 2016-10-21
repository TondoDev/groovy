package org.tondo.iban

import spock.lang.*


class IbanGenTest extends Specification {

  def generator = new Something()

  def "Test something is ok"() {

    setup :
    println "Executing test! " + some.myId

    expect: 1+2 == 4
  }

  def "gugugu"() {

    setup :
    println "Executing test " + some.myId

    expect: 1+2 == 4
  }
}
