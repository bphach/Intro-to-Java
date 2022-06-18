package Lesson03_GUI;

import javax.swing.JOptionPane;

public class GUI {

    public static void main(String[] args){

       String name = JOptionPane.showInputDialog("Enter your name");//This will give you an input box to type in your name 

       JOptionPane.showMessageDialog(null, "Hello " + name);//This will display the information when you enter input for the box 
       
       int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));//attempting to assign this string to an integer variable. Need to turn it into an integer by using integer parse method 
       //JOptionPane.showInputDialog("Enter your age") This will return a string base off what the user type in. Integer parse method convert it to an integer to store it within our integer of age 
       JOptionPane.showMessageDialog(null, "You are " + age + " years old");

       Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
       JOptionPane.showMessageDialog(null, "You are " + height + " feet tall ");
    }

    }
   