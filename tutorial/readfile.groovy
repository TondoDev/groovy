// reading file
int line = 1
new File('multimethod.groovy').eachLine('UTF-8') {
  println  line + " " +  it
  line++
}

// print content of direcotry
new File('.').eachFile { file ->
  // file is instance of java.io.File
  println file.name
}
