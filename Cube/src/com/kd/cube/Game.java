package com.kd.cube;

import com.kd.cube.system.Screen;

public class Game extends Screen {

	public Game() {
		setScreen(800, 400, "Render", "#111111");
	}
	
    public void update() {}
	public void render() {}
	public void destroy() {}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
}
