package com.Controlstatments.java;

public class SwitchString {

	public static void main(String[] args) {

		String s = "he";

		switch (s) {

		case "hello":

			System.out.println("This is hello");
			break;

		case "hi":
			System.out.println("This is hi");
			break;

		default:

			System.out.println("This is something else");
			break;

		}
	}
}
