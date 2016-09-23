package org.tondo.gro

import org.tondo.jav.SomeJav;

class AppGroovy {

  static void main(String... args) {
    println "Running groovy application..."
    println new SomeGro().getMessage()
    println new SomeJav().getMessage()
  }
}
