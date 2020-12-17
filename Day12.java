public class Day12 {
  public static void main(String[] args) {
    int[] testScores = {100, 80};
    Student s = new Student("Heraldo", "Memelli", 8135627, testScores);
    s.printPerson();
    System.out.println("Grade: " + s.calculate() );
  }

  static class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
      this.firstName = firstName;
      this.lastName = lastName;
      this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
      System.out.println(
          "Name: " + lastName + ", " + firstName
              + 	"\nID: " + idNumber);
    }
  }

  static class Student extends Person {
    private int[] testScores;
    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(
        String firstName,
        String lastName,
        int identification,
        int[] testScores
    ) {
      super(firstName, lastName, identification);
      this.testScores = testScores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public Character calculate() {
      int sum = 0;
      for (int score : testScores) {
        sum += score;
      }
      int average = sum / testScores.length;
      if (average >= 90) {
        return 'O';
      }
      if (average >= 80) {
        return 'E';
      }
      if (average >= 70) {
        return 'A';
      }
      if (average >= 55) {
        return 'P';
      }
      if (average >= 40) {
        return 'D';
      }
      return 'T';
    }
  }
}
