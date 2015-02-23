package com.kd.cube.system;

import com.kd.cube.math.Vector3f;
import com.kd.cube.util.Color;
import com.kd.cube.util.Render;

public class Screen {
	public Core core;
	
	protected int width = 400;
	protected int height = 600;
	protected String title = "Render";
	protected Vector3f color = Vector3f.create(1, 1, 1);
	
	public void created() {
		Render.setClearColor(color);
	}
    public void update() {}
	public void render() {}
	public void destroy() {}
	
	public final void setWidth(int width) {
		this.width = width;
	}
	public final void setHeight(int height) {
		this.height = height;
	}
	public final void setTitle(String title) {
		this.title = title;
	}
	public final void setColor(Vector3f color) {
		this.color = color;
	}
	public final void setColor(float red, float blue, float green) {
		this.color.setX(red); this.color.setY(blue); this.color.setZ(green);
	}
	public final void setColor(String color) {
		float colorf[] = Color.toFloat(color);
		this.color.setX(colorf[0]);
		this.color.setY(colorf[1]);
		this.color.setZ(colorf[2]);
	}
	public final void setRed(float red) {
		this.color.setX(red);
	}
	public final void setBlue(float blue) {
		this.color.setY(blue);
	}
	public final void setGreen(float green) {
		this.color.setZ(green);
	}
	public final void setClearColor() {
		Render.setClearColor(color);
	}
	public final void setScreen(int width, int height, String title, Vector3f color) {
		setWidth(width); setHeight(height); setTitle(title); setColor(color);
	}
	public final void setScreen(int width, int height, String title, float red, float blue, float green) {
		setWidth(width); setHeight(height); setTitle(title); setColor(red, blue, green);
	}
	public final void setScreen(int width, int height, String title, String color) {
		setWidth(width); setHeight(height); setTitle(title); setColor(color);
	}
	public final Vector3f getColor() {
		return this.color;
	}
	public final float getRed() {
		return this.color.getX();
	}
	public final float getBlue() {
		return this.color.getY();
	}
	public final float getGreen() {
		return this.color.getZ();
	}
	
	public void start() {
		core = new Core(width, height, title);
		core.setScreen(this);
		core.start();
	}
}