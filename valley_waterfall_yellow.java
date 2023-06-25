public class MentorshipProgram {

// Declare class variables
private String name;
private int duration;
private String goals;

// Constructor
public MentorshipProgram(String name, int duration, String goals) {
    this.name = name;
    this.duration = duration;
    this.goals = goals;
}

// Getter methods
public String getName() {
    return name;
}

public int getDuration() {
    return duration;
}

public String getGoals() {
    return goals;
}

// Setter methods
public void setName(String name) {
    this.name = name;
}

public void setDuration(int duration) {
    this.duration = duration;
}

public void setGoals(String goals) {
    this.goals = goals;
}

// Mentor methods
public void introduceMentorshipProgram() {
    System.out.println("Welcome to the " + name + " mentorship program!");
    System.out.println("This program will help you identify and achieve your goals in " + duration + " days. Our goal is to inspire you to reach for the stars and dream big!");
}

public void explainGoals() {
    System.out.println("We will help you set " + goals + " goals to reach within the duration of the program.");
    System.out.println("We'll provide resources, advice, and support every step of the way!");
}

public void discussProgress() {
    System.out.println("We will also monitor your progress and help you develop a plan to achieve success!");
    System.out.println("Let's get started and make those dreams a reality!");
}

// Main method
public static void main(String[] args) {

    MentorshipProgram mentorshipProgram = new MentorshipProgram("Dream Big", 60, "short-term and long-term");
    mentorshipProgram.introduceMentorshipProgram();
    mentorshipProgram.explainGoals();
    mentorshipProgram.discussProgress();

}

}