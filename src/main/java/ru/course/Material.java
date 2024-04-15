package ru.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "material")
public class Material {
    @Column (name = "type_material")
    private char typeMaterial;
    @Column (name = "contains_material")
    private String containsMaterial;
    @Column (name = "level_difficulty")
    private char levelDifficulty;
    @Id
    @Column (name = "material_id")
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
