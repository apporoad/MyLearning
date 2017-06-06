package Lession2.Demo005;

import java.util.Random;

public class Student implements Comparable<Student> {
	private int id;
	
	private int grade;
	
	private int score;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public Student(){
		Random r = new Random();
		id = r.nextInt(30) +1;
		grade = r.nextInt(6) +1;
		score = r.nextInt(101);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student)
		{
			if(this.id == ((Student)obj).id)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public int compareTo(Student o) {
		return this.score - o.score;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id["+this.id+"] grade["+this.grade+"] score["+this.score+"]";
	}
}
