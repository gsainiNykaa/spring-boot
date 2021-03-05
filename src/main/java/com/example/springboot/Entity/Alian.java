package com.example.springboot.Entity;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table("Alian")
public class Alian {
    @Id
    private  int aid;
    private String aname;
    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
    public  String toString(){
        return "Alian: name: "+aname+"\n";
    }
}
