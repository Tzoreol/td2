package fr.tzoreol.td2.dtos;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("region")
@RequestScoped
public class RegionDto implements Serializable {
    private List<DepartmentDto> departments;

    public RegionDto() {
        this.departments = new ArrayList<>();
        this.departments.add(new DepartmentDto(18, "Cher", "Bourges"));
        this.departments.add(new DepartmentDto(28, "Eure-et-Loir", "Chartres"));
        this.departments.add(new DepartmentDto(36, "Indre", "Châteauroux"));
        this.departments.add(new DepartmentDto(37, "Indre-et-Loire", "Tours"));
        this.departments.add(new DepartmentDto(41, "Loir-et-Cher", "Blois"));
        this.departments.add(new DepartmentDto(45, "Loiret", "Orléans"));
    }

    public List<DepartmentDto> getDepartments() {
        return departments;
    }

    public void setDepartments(List<DepartmentDto> departments) {
        this.departments = departments;
    }
}
