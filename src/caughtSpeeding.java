public class caughtSpeeding {
  public int caughtSpeeding(int speed, boolean isBirthday) {
    if (speed < 61 || (speed < 66 && isBirthday)) {
      return 0;
    } else if ((speed > 60 && speed < 81) || (speed > 65 && speed < 86 && isBirthday)) {
      return 1;
    } else {
      return 2;
    }
  }
}
