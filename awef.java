package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class awef {
	public static class  Comp implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub

			String c = o1.toString() + o2.toString();
			String d = o2.toString() + o1.toString();

			if (Integer.parseInt(c) > Integer.parseInt(d)) {
				return -1;
			}

			return 1;

		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String[] numS = a.split(" ");
		Integer[] numI = new Integer[numS.length];
		for (int i = 0; i < numS.length; i++) {
			numI[i] = Integer.parseInt(numS[i]);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < numI.length; i++) {
			list.add(numI[i]);
		}
		Collections.sort(list, new Comp());
		String max = "";
		String min = "";
		for (int i = 0; i < list.size(); i++) {
			max += Integer.toString(list.get(i));
		}

		System.out.println(max);
		for (int i = list.size() - 1; i >= 0; i--) {
			min += Integer.toString(list.get(i));
		}
		System.out.println(min);

		int answer = Integer.parseInt(max) + Integer.parseInt(min);
		System.out.println(answer);
	}
}
