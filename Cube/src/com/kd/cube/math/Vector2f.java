package com.kd.cube.math;

public class Vector2f {
    private float x, y;
   
    public Vector2f(float x, float y) {
	    this.x = x;
	    this.y = y;
    }
   
    public Vector2f() {
  	    this(0, 0);
    }
   
    public static Vector2f create(float x, float y) {
	    return new Vector2f(x, y);
    }
   
    public static Vector2f create() {
	    return new Vector2f();
    }

    public float getLength() {
	   return (float) Math.sqrt(x * x + y * y);
    }
    
    public float dot(Vector2f r) {
		return x * r.getX() + y * r.getY();
	}
    
    public Vector2f normalize(){
		float length = getLength();

		x /= length; y /= length;;

		return this;
	}
	
	public Vector2f getNormalized() {
		float length = getLength();
		
		return new Vector2f(x / length, y / length);
	}
	
	public Vector2f add(Vector2f r) {
		this.x += r.getX(); this.y += r.getY();;
		
		return this;
	}

	public Vector2f add(float r) {
		x += r; y += r;;
		
		return this;
	}

	public Vector2f sub(Vector2f r) {
		x -= r.getX(); y -= r.getY();;
		
		return this;
	}

	public Vector2f sub(float r) {
		x -= r; y -= r;;
		
		return this;
	}
	
    public Vector2f mul(Vector2f r) {
		x *= r.getX(); y *= r.getY();;
		
		return this;
	}

	public Vector2f mul(float r) {
		x *= r; y *= r;;
		
		return this;
	}
	
	public Vector2f div(Vector2f r) {
		x /= r.getX(); y /= r.getY();;
		
		return this;
	}

	public Vector2f div(float r) {
		x /= r; y /= r;;
		
		return this;
	}
	
    public Vector2f getAdded(Vector2f r) {
		return new Vector2f(x + r.getX(), y + r.getY());
	}

	public Vector2f getAdded(float r) {
		return new Vector2f(x + r, y + r);
	}

	public Vector2f getSubed(Vector2f r) {
		return new Vector2f(x - r.getX(), y - r.getY());
	}

	public Vector2f getSubed(float r) {
		return new Vector2f(x - r, y - r);
	}
	
    public Vector2f getMuled(Vector2f r) {
		return new Vector2f(x * r.getX(), y * r.getY());
	}

	public Vector2f getMuled(float r) {
		return new Vector2f(x * r, y * r);
	}
	
	public Vector2f getDived(Vector2f r) {
		return new Vector2f(x / r.getX(), y / r.getY());
	}

	public Vector2f getDived(float r) {
		return new Vector2f(x / r, y / r);
	}
	
    public void setX(float x) {
	    this.x = x;
    }

    public void setY(float y) {
	    this.y = y;
    }
    
    public void setPosition(float x, float y) {
    	this.x = x;
    	this.y = y;
    }
    
    public void setPosition(float[] position) {
    	this.x = position[0];
    	this.y = position[1];
    }
   
    public float getX() {
	    return x;
    }

    public float getY() {
	    return y;
    }
    
    public float[] getPosition() {
    	return new float[] {x, y};
    }
    
    public Vector2f abs() {
		return new Vector2f(Math.abs(x), Math.abs(y));
	}

	public String toString() {
		return "(" + x + ", " + y +")";
	}
}