String method(String arg) {
  return "string"
}

String method(Object arg) {
  return "object"
}

println "Hallow world!"
println "By string: " + method("ahoj")
println "By Integer: " + method(1)
