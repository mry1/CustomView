package com.example.myapplication.practice;

/**
 * Created by louis2 on 18-2-27.
 */
public class Main {  
    public static void main(String[] args)  {  
        Animal animal = new Animal();  
        animal.setName("cat");  
    }  
  
    public static class Animal{  
        private String name;  
  
        public String getName() {  
            return name;  
        }  
  
        public void setName(String name) {  
            this.name = name;  
        }  
    }  
}  
