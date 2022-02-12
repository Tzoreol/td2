package fr.tzoreol.td2.dtos;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("department")
@RequestScoped
public class DepartmentDto implements Serializable {
    private int number;
    private String name;
    private String prefecture;

    public DepartmentDto() {
        //Here because we used another constructor
    }

    public DepartmentDto(int number, String name, String prefecture) {
        this.number = number;
        this.name = name;
        this.prefecture = prefecture;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }
}
