package com.example.demo.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    String fn;
    String ln;
    String add;
    String pht;
    String ctg;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFn() {
        return fn;
    }
    public void setFn(String fn) {
        this.fn = fn;
    }
    public String getLn() {
        return ln;
    }
    public void setLn(String ln) {
        this.ln = ln;
    }
    public String getAdd() {
        return add;
    }
    public void setAdd(String add) {
        this.add = add;
    }
    public String getPht() {
        return pht;
    }
    public void setPht(String pht) {
        this.pht = pht;
    }
    public String getCtg() {
        return ctg;
    }
    public void setCtg(String ctg) {
        this.ctg = ctg;
    } 
}
