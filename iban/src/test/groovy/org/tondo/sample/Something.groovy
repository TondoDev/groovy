class Something {
  static int counter = 0;

  int myId;
  Something() {
    myId = ++counter;
  }
}
