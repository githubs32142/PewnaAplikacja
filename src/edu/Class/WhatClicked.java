/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Class;

public class WhatClicked {
    private int id;
    private String type;

    public WhatClicked() {
    }
 
    public WhatClicked(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
/**
 ** Metoda, która zwraca figurę która została zaznaczona 
 * @return typ figury
 */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "WhatClicked{" + "id=" + id + ", type=" + type + '}';
    }
    
}
