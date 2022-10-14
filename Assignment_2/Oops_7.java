package com.Yash.Assignment_2;
/*
Perform the following Inheritance map of
Atheltic class :- aid, aname, address, dob
Circket_player :- teamname, jersyno, totalruns, highestscore, avg, totalmatchedplayed.
Football_player :- teamname, jersyno, totalgoals, highestgoal_in_a_match, 
totalmatchedplayed.
Hockey:- teamname, jersyno, totalgoals, highest_goal_in_a_match, total_matched_played
 */
class Athletic
{
	int aid;
	String aname;
	String address;
	String dob;
	public Athletic(int aid, String aname, String address, String dob) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.address = address;
		this.dob = dob;
	}
}
class Cricket_Player extends Athletic
{
	String teamname;
	int jerseyno;
	int totalruns;
	int highestscore;
	Double average;
	int totalmatchplayed;
	public Cricket_Player(int aid, String aname, String address, String dob, String teamname, int jerseyno,
			int totalruns, int highestscore, Double average, int totalmatchplayed) {
		super(aid, aname, address, dob);
		this.teamname = teamname;
		this.jerseyno = jerseyno;
		this.totalruns = totalruns;
		this.highestscore = highestscore;
		this.average = average;
		this.totalmatchplayed = totalmatchplayed;
	}
	@Override
	public String toString() {
		return "Cricket_Player [teamname=" + teamname + ", jerseyno=" + jerseyno + ", totalruns=" + totalruns
				+ ", highestscore=" + highestscore + ", average=" + average + ", totalmatchplayed=" + totalmatchplayed
				+ "]";
	}
	public Cricket_Player(int aid, String aname, String address, String dob) {
		super(aid, aname, address, dob);
		
	}
	
}
class FootBallPlayer extends Athletic
{
	String teamname;
	int jerseyno;
	int totalgoals;
	int highestgoal_in_a_match;
	int totalmatchplayed;
	public FootBallPlayer(int aid, String aname, String address, String dob, String teamname, int jerseyno,
			int totalgoals, int highestgoal_in_a_match, int totalmatchplayed) {
		super(aid, aname, address, dob);
		this.teamname = teamname;
		this.jerseyno = jerseyno;
		this.totalgoals = totalgoals;
		this.highestgoal_in_a_match = highestgoal_in_a_match;
		this.totalmatchplayed = totalmatchplayed;
	}

public FootBallPlayer(int aid, String aname, String address, String dob) {
		super(aid, aname, address, dob);
	}

@Override
public String toString() {
	return "FootBallPlayer [teamname=" + teamname + ", jerseyno=" + jerseyno + ", totalgoals=" + totalgoals
			+ ", highestgoal_in_a_match=" + highestgoal_in_a_match + ", totalmatchplayed=" + totalmatchplayed + ", aid="
			+ aid + ", aname=" + aname + ", address=" + address + ", dob=" + dob + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
class Hockey extends Athletic
{
	String teamname;
	int jerseyno;
	int totalgoals;
	int highestgoal_in_a_match;
	public Hockey(int aid, String aname, String address, String dob, String teamname, int jerseyno, int totalgoals,
			int highestgoal_in_a_match) {
		super(aid, aname, address, dob);
		this.teamname = teamname;
		this.jerseyno = jerseyno;
		this.totalgoals = totalgoals;
		this.highestgoal_in_a_match = highestgoal_in_a_match;
	}
	public Hockey(int aid, String aname, String address, String dob) {
		super(aid, aname, address, dob);
	}
	public String toString() {
		return "Hockey [teamname=" + teamname + ", jerseyno=" + jerseyno + ", totalgoals=" + totalgoals
				+ ", highestgoal_in_a_match=" + highestgoal_in_a_match + ", aid=" + aid + ", aname=" + aname
				+ ", address=" + address + ", dob=" + dob + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
public class Oops_7 {
	public static void main(String[] args) {
		Hockey h=new Hockey(10, "Sunil", "Pune", "25-09-1990", "Chennai Super kings", 44, 5, 3);
		System.out.println(h);
	    FootBallPlayer fb=new FootBallPlayer(20, "Jack", "Uk", "26-11-1992", "India", 007, 5, 4, 3);
	    System.out.println(fb);
	    Cricket_Player cp=new Cricket_Player(25, "Rohit", "Mumbai", "31-05-1989", "Mubai Indians", 90, 888, 120, 55.5, 79);
		System.out.println(cp);

	}

}
