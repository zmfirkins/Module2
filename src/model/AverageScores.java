package model;

public class AverageScores {
private String name;
private int score1;
private int score2;
private int score3;

public AverageScores(String name, int sc1, int sc2, int sc3) {
	setName(name);
	setScore1(sc1);
	setScore2(sc2);
	setScore3(sc3);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getScore1() {
	return score1;
}
public void setScore1(int score1) {
	this.score1 = score1;
}
public int getScore2() {
	return score2;
}
public void setScore2(int score2) {
	this.score2 = score2;
}
public int getScore3() {
	return score3;
}
public void setScore3(int score3) {
	this.score3 = score3;
}
public double Average() {
	double AverageScore= (getScore1() + getScore2() + getScore3())/3;
	return AverageScore;
}
public String Final() {
	System.out.println("Name: " + getName() + " Average Score: " +  Average());
	return  toString();
}
@Override
public String toString() {
	return "Name: " + getName() + " Average Score: " +  Average();
}

}
