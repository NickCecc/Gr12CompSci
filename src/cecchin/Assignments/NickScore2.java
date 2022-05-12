package cecchin.Assignments;

import java.util.Scanner;

public class NickScore2 {
	Scanner sc;

	public NickScore2() {
		sc = new Scanner(System.in);
		// 1. Score-keeper:
		// Vortex shots inputs:
		System.out.println("Enter int # of Vortex's 3 point shots: ");
		int vortex3Point = sc.nextInt();
		System.out.println("Enter int # of Vortex's 2 point shots: ");
		int vortex2Point = sc.nextInt();
		System.out.println("Enter int # of Vortex's 1 point free throws: ");
		int vortex1Point = sc.nextInt();

		// Clowns shots inputs:
		System.out.println("Enter int # of Clown's 3 point shots: ");
		int clown3Point = sc.nextInt();
		System.out.println("Enter int # of Clown's 2 point shots: ");
		int clown2Point = sc.nextInt();
		System.out.println("Enter int # of Clown's 1 point free throws: ");
		int clown1Point = sc.nextInt();

		// Get vortex and clown total points:
		int vortexPoints = vortexPoints(vortex3Point, vortex2Point, vortex1Point);
		int clownPoints = clownPoints(clown3Point, clown2Point, clown1Point);

		// Print the total points of both teams:
		System.out.println("V: " + vortexPoints + " C: " + clownPoints);

		// Decide and output the winner:
		String teamWin = winner(vortexPoints, clownPoints);
		System.out.println("Winner is: " + teamWin);

	}

	// Vortex total points method:
	public int vortexPoints(int point3, int point2, int point1) {
		int vortexTotalPoints = (point3 * 3) + (point2 * 2) + point1;
		return vortexTotalPoints;

	}

	// Clown total Points method:
	public int clownPoints(int point3, int point2, int point1) {
		int clownTotalPoints = (point3 * 3) + (point2 * 2) + point1;
		return clownTotalPoints;

	}

	// Decide the winner method:
	public String winner(int totalVortex, int totalClown) {
		String winTeam = "";
		if (totalVortex > totalClown) {
			winTeam = "V";
		} else if (totalVortex < totalClown) {
			winTeam = "C";
		} else if (totalVortex == totalClown) {
			winTeam = "T";
		} else {
			winTeam = "Invalid";
		}
		return winTeam;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NickScore2();

	}

}
