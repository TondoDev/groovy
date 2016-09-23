println 'A'
println ((int)'Z'-(int)'A')
println "----------------"
def str = "ABCD".collectReplacements{
  def repl = null

  if (it.isLetter()) {
    repl = ((int)it - (int)'A' + 10).toString()
  } else {
    repl = it.toString()
  }
  println "${it} ${repl}"
  repl
}
println "pokus"
println str
def suma = (1G..1000000G).sum()
println "suma: " + suma
println suma.class
