/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invoicebilling;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */

class Node {
    public String id;
    public String name;
    public int ammount;        
    public double price;
    public Node next;
    //public Node prev;
    
    public Node(String id, String name, int ammount, double price) {
        this.id = id;
        this.name = name;
        this.ammount = ammount;        
        this.price = price;        
    }
}

public class ShoppingCart {
    private Node first;
    private Node last;       
    //private static ShoppingCart instance = null;
    
    /* public static ShoppingCart getInstance() {
        if(instance == null)
            instance = new ShoppingCart();
        return instance;
    } */
    
    public void ShoppingCart() {
        first = null;
        first.next = null;
        last = null;
        last.next = null;
    }
    
    public double total(){
        if (first == null) return 0.0;
        Node current = first;
        double total = 0.0;
        while (current != null){
            total += current.ammount*current.price;
            current = current.next;
        }
        return total;
    }
    
    public int addLast (String id, String name, int ammount, double price) {
        Node n = new Node(id, name, ammount, price);
        
        int check = existed(id);
        if (check != 0 ) {
            return check;
        }
        
        if (first == null) {
            first = n;
            last = n;
        } else if (first == last) {                
            n.next = last.next;
            first.next = n;
            last = n;
        } else {
            n.next = last.next;
            last.next = n;
            last = n;
        }                          
        return 0;
    }    
    
    public void delete(String key) {
        if (first == null) return;
        Node current = first;
        Node prev = new Node("0", "0", 0, 0);
        while (current != null) {            
            if (current.id.equals(key)) {
                if (current == first) {
                    current.next = first.next;
                    first = null;
                    return;
                } else {                    
                    Node current2 = first;
                    while (current2.next != current) {
                        current2 = current2.next;
                        if (current2.next == current) {
                            current2.next = current.next;
                            current = null;
                            return;
                        }
                    }
                }
            }
            current = current.next;
        }
    }
    
    public int existed(String key) {
        if (first == null) return 0;
        Node current = first;
        int cnt=1;       
        while (current != null) {           
            //System.out.println(cnt + " " + current.id + " " + key);
            if (current.id.equals(key)) {
                current.ammount++;
                return cnt;
            }    
            cnt++;
            current = current.next;            
        }                   
        return 0;
    }    
    
    public void display() {
        if (first == null) return;
        Node current = first;
        while (current != null) {
            //System.out.println(current.id + " " + current.name);
            current = current.next;
        }
    }
    
    public void delete() {
        first.next = null;
        first = null;
    }
}


