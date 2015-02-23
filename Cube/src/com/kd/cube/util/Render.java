package com.kd.cube.util;

import static org.lwjgl.opengl.GL11.GL_BACK;
import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_CULL_FACE;
import static org.lwjgl.opengl.GL11.GL_CW;
import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_TEST;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.GL_VERSION;
import static org.lwjgl.opengl.GL32.GL_DEPTH_CLAMP;

import org.lwjgl.opengl.GL11;

import com.kd.cube.math.Vector3f;

public class Render {
	
	public static void clearScreen() {
		GL11.glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	}
	
	public static void setClearColor(Vector3f color) {
		GL11.glClearColor(color.getX(), color.getY(), color.getZ(), 1);
	}
	
	/*public static void ableTextures(boolean enabled) {
		if (enabled)
			GL11.glEnable(GL_TEXTURE_2D);
		else
			GL11.glDisable(GL_TEXTURE_2D);
	}
	
	public static void unbindTextures() {
		GL11.glBindTexture(GL_TEXTURE_2D, 0);
	}*/
	
	public static void initGraphics() {
		GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
		
		GL11.glFrontFace(GL_CW);
		GL11.glCullFace(GL_BACK);
		GL11.glEnable(GL_CULL_FACE);
		GL11.glEnable(GL_DEPTH_TEST);
//		GL11.glPolygonMode(GL_FRONT_AND_BACK, GL_LINE);
		
		GL11.glEnable(GL_DEPTH_CLAMP);
		
		GL11.glEnable(GL_TEXTURE_2D);
//		GL11.glEnable(GL_FRAMEBUFFER_SRGB);
	}
	
	public static String getVersion() {
		return GL11.glGetString(GL_VERSION);
	}
}
