class JavaAppl {
  enum WeekDay {
    Mon, Tue, Wed, Thu, Fri, Sat, Sun
  }
  private static void printDayName(WeekDay day) {
    switch (day) {
      case Mon: System.out.println("Monday");
        break;
      case Tue: System.out.println("Tuesday");
        break;
      case Wed: System.out.println("Wednesday");
        break;
      case Thu: System.out.println("Thursday");
        break;
      case Fri: System.out.println("Friday");
        break;
      case Sat: System.out.println("Saturday");
        break;
      case Sun: System.out.println("Sunday");
        break;
      default: System.out.println("What the he...?!");
    }
  }
  public static void main(String[] args) {
    for (WeekDay day : WeekDay.values()) {
      printDayName(day);
    }
  }
}