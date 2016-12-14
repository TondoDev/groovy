package org.tondo.sample

import spock.lang.*


class IbanGenTest extends Specification {
  // private property in specification is instantiated  for each test method
  def generator = new Something()

  def "Test something is ok"() {

    setup :
    println "Executing test! " + generator.myId

    expect: 1+2 == 3
  }

  def "gugugu"() {

    setup :
    println "Executing test " + generator.myId

    expect: 1+2 == 3
  }
}
