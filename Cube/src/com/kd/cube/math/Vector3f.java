package com.kd.cube.math;

public class Vector3f {
    private float x, y, z;
   
    public Vector3f(float x, float y, float z) {
	    this.x = x;
	    this.y = y;
	    this.z = z;
    }
   
    public Vector3f() {
  	    this(0, 0, 0);
    }
   
    public static Vector3f create(float x, float y, float z) {
	    return new Vector3f(x, y, z);
    }
   
    public static Vector3f create() {
	    return new Vector3f();
    }

    public float getLength() {
	   return (float) Math.sqrt(x * x + y * y + z * z);
    }
    
    public float dot(Vector3f r) {
		return x * r.getX() + y * r.getY() + z * r.getZ();
	}
    
    public Vector3f normalize(){
		float length = getLength();

		x /= length; y /= length; z /= length;

		return this;
	}
	
	public Vector3f getNormalized() {
		float length = getLength();
		
		return new Vector3f(x / length, y / length, z / length);
	}
	
	public Vector3f cross(Vector3f r) {
		x = y * r.getZ() - z * r.getY();
		y = x * r.getZ() - z * r.getX();
	    z = x * r.getY() - y * r.getX();
		
		return this;
	}
	
	public Vector3f getCrossed(Vector3f r) {
		float x_ = y * r.getZ() - z * r.getY();
		float y_ = x * r.getZ() - z * r.getX();
		float z_ = x * r.getY() - y * r.getX();
		
		return new Vector3f(x_, -y_, z_);
	}
	
	public Vector3f add(Vector3f r) {
		this.x += r.getX(); this.y += r.getY(); this.z += r.getZ();
		
		return this;
	}

	public Vector3f add(float r) {
		x += r; y += r; z += r;
		
		return this;
	}

	public Vector3f sub(Vector3f r) {
		x -= r.getX(); y -= r.getY(); z -= r.getZ();
		
		return this;
	}

	public Vector3f sub(float r) {
		x -= r; y -= r; z -= r;
		
		return this;
	}
	
    public Vector3f mul(Vector3f r) {
		x *= r.getX(); y *= r.getY(); z *= r.getZ();
		
		return this;
	}

	public Vector3f mul(float r) {
		x *= r; y *= r; z *= r;
		
		return this;
	}
	
	public Vector3f div(Vector3f r) {
		x /= r.getX(); y /= r.getY(); z /= r.getZ();
		
		return this;
	}

	public Vector3f div(float r) {
		x /= r; y /= r; z /= r;
		
		return this;
	}
	
    public Vector3f getAdded(Vector3f r) {
		return new Vector3f(x + r.getX(), y + r.getY(), z + r.getZ());
	}

	public Vector3f getAdded(float r) {
		return new Vector3f(x + r, y + r, z + r);
	}

	public Vector3f getSubed(Vector3f r) {
		return new Vector3f(x - r.getX(), y - r.getY(), z - r.getZ());
	}

	public Vector3f getSubed(float r) {
		return new Vector3f(x - r, y - r, z - r);
	}
	
    public Vector3f getMuled(Vector3f r) {
		return new Vector3f(x * r.getX(), y * r.getY(), z * r.getZ());
	}

	public Vector3f getMuled(float r) {
		return new Vector3f(x * r, y * r, z * r);
	}
	
	public Vector3f getDived(Vector3f r) {
		return new Vector3f(x / r.getX(), y / r.getY(), z / r.getZ());
	}

	public Vector3f getDived(float r) {
		return new Vector3f(x / r, y / r, z / r);
	}
	
    public void setX(float x) {
	    this.x = x;
    }

    public void setY(float y) {
	    this.y = y;
    }

    public void setZ(float z) {
	    this.z = z;
    }
    
    public void setPosition(float x, float y, float z) {
    	this.x = x;
    	this.y = y;
    	this.z = z;
    }
    
    public void setPosition(float[] position) {
    	this.x = position[0];
    	this.y = position[1];
    	this.z = position[2];
    }
   
    public float getX() {
	    return x;
    }

    public float getY() {
	    return y;
    }

    public float getZ() {
	    return z;
    }
    
    public float[] getPosition() {
    	return new float[] {x, y, z};
    }
    
    public Vector3f abs() {
		return new Vector3f(Math.abs(x), Math.abs(y), Math.abs(z));
	}

	public String toString() {
		return "(" + x + ", " + y + ", " + z +")";
	}
}