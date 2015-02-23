package com.kd.cube.system;

import com.kd.cube.util.Render;
import com.kd.cube.util.Time;

public class Core {
	private boolean isRunning;
	
	private Window window;
	private Screen screen;
	
	private double pfs = 60;
	private int frameCounter = 0;
	private long lastTime = 0;
	private long afterTime = 0;
	private long passedTime = 0;
	private long timeToTick = 0;
	public long gametick = 0;

	public Core(int width, int height, String title) {
		isRunning = false;
		isRunning = false;
		window = Window.createWindow(width, height, title);
		Render.initGraphics();
		System.out.println(Render.getVersion());
	}
	
	public Core(String title) {
		this(800, 600, title);
	}
	
	public Core() {
		this(800, 600, "Cube");
	}
	
	public void start() {
		if (isRunning)
			return;
		isRunning = true;
		run();
	}
	
	public void stop() {
		if (!isRunning)
			return;
		isRunning = false;
	}

	public void run() {
		screen.created();
		while (isRunning) {
			afterTime = lastTime;
			lastTime = System.nanoTime();
			passedTime = lastTime - afterTime;
			timeToTick = Time.SECOND / passedTime;
			Time.setDelta(1.0/pfs);
			if (window.isCloseRequested())
			  	stop();
			if (timeToTick/pfs > frameCounter)
				frameCounter++;
			else {
				frameCounter = 0;
				render();
			}
		    update();
		    try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		destroy();
	}

	private void update() {
		screen.update();
	}
	
	private void render() {
		Render.clearScreen();
		screen.render();
		window.render();
	}

	private void destroy() {
		System.out.println("Destroy");
		window.destroy();
		screen.destroy();
	}
	
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
}

