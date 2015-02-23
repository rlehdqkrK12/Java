package com.kd.cube.util;

public class Util {
	
	/*public static FloatBuffer createFloatBuffer(int size) {
		return BufferUtils.createFloatBuffer(size);
	}
	
	public static IntBuffer createIntBuffer(int size) {
		return BufferUtils.createIntBuffer(size);
	}
	
	public static FloatBuffer createFlippedBuffer(Vertex[] vertices) {
		FloatBuffer buffer = createFloatBuffer(vertices.length * Vertex.SIZE);
		
		for (int i = 0; i < vertices.length; i++) {
			buffer.put(vertices[i].getPos().getX());
			buffer.put(vertices[i].getPos().getY());
			buffer.put(vertices[i].getPos().getZ());
			buffer.put(vertices[i].getTexCoord().getX());
			buffer.put(vertices[i].getTexCoord().getY());
			buffer.put(vertices[i].getNormal().getX());
			buffer.put(vertices[i].getNormal().getY());
			buffer.put(vertices[i].getNormal().getZ());
		}
		
		buffer.flip();
		
		return buffer;
	}
	
	public static IntBuffer createFlippedBuffer(int[] values) {
		IntBuffer buffer = createIntBuffer(values.length);
		buffer.put(values);
		buffer.flip();
		
		return buffer;
	}
	
	public static FloatBuffer createFlippedBuffer(Matrix4f value) {
		FloatBuffer buffer = createFloatBuffer(4 * 4);
		
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				buffer.put(value.get(i, j));
		
		buffer.flip();
		
		return buffer;
	}
	
	public static String[] removeEnptyStrings(String[] data) {
		ArrayList<String> result = new ArrayList<String>();
		
		for (int i = 0; i < data.length; i++)
			if (!data[i].equals(""))
				result.add(data[i]);
		
		String[] res = new String[result.size()];
		result.toArray(res);
		
		return res;
	}
	
	public static int[] toIntArray(Integer[] data) {
		int[] result = new int[data.length];
		
		for (int i = 0; i < data.length; i++) {
			result[i] = data[i].intValue();
		}
		
		return result;
	}
	
	public static Matrix4f toMatrix(int[] data) {
		Matrix4f res = new Matrix4f();
		
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				res.set(x, y, data[x * y + y]);
			}
		}
		return res;
	}
	
	public static Matrix4f toMatrix(float[] data) {
		Matrix4f res = new Matrix4f();
		
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				res.set(x, y, data[x * y + y]);
			}
		}
		return res;
	}*/
}
