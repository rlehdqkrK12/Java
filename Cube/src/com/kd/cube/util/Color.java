package com.kd.cube.util;

public class Color {
	public static int[] toInt(String color) {
		if (color.charAt(0) != '#') {
			return new int[] {Integer.valueOf(color.substring(0, 2), 16),
					          Integer.valueOf(color.substring(2, 4), 16),
					          Integer.valueOf(color.substring(4, 6), 16)};
		}else {
			return new int[] {Integer.valueOf(color.substring(1, 3), 16),
					          Integer.valueOf(color.substring(3, 5), 16),
			                  Integer.valueOf(color.substring(5, 7), 16)};
		}
	}
	
	public static float[] toFloat(String color) {
		if (color.charAt(0) != '#') {
			return new float[] {(float) Integer.valueOf(color.substring(0, 2), 16) / 255,
					            (float) Integer.valueOf(color.substring(2, 4), 16) / 255,
					            (float) Integer.valueOf(color.substring(4, 6), 16) / 255};
		}else {
			return new float[] {(float) Integer.valueOf(color.substring(1, 3), 16) / 255,
					            (float) Integer.valueOf(color.substring(3, 5), 16) / 255,
					            (float) Integer.valueOf(color.substring(5, 7), 16) / 255};
		}
	}
}
