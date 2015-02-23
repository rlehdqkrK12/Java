package com.kd.cube.system;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.*;

public class Window {
	
	public Window(int width, int height, String title) {
		try {
			Display.setDisplayMode(new DisplayMode(width, height));
			Display.setTitle(title);
			Display.create();
			Keyboard.create();
			Mouse.create();
		}
		catch (LWJGLException e) {
			e.printStackTrace();
		}
	}

	public static Window createWindow(int width, int height, String title) {
		return new Window(width, height, title);
	}
	
	public void render() {
		Display.update();
	}
	
	public void destroy() {
		Display.destroy();
		Keyboard.destroy();
		Mouse.destroy();
	}
	
	public boolean isCloseRequested() {
		return Display.isCloseRequested();
	}
	
	public int getWidth() {
		return Display.getWidth();
	}
	
	public int getHeight() {
		return Display.getHeight();
	}
	
	public String getTitle() {
		return Display.getTitle();
	}
}

