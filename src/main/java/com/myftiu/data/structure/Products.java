package com.myftiu.data.structure;

import java.util.List;
import java.util.Map;

/**
 * @author by ali myftiu on 08/10/14.
 */
public class Products {

    private int id;
    private String name;
	private Map attributes;


	public Products() {
	}

	public Products(int id, Map attributes)
	{
		this.id = id;
        this.attributes = attributes;

	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map getAttributes() {
        return attributes;
    }

    public void setAttributes(Map attributes) {
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}

