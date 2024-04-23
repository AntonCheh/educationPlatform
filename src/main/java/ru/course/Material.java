package ru.course;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "material")
@Schema(name = "public")
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

    public char getLevelDifficulty() {
        return levelDifficulty;
    }

    public void setLevelDifficulty(char levelDifficulty) {
        this.levelDifficulty = levelDifficulty;
    }

    public String getContainsMaterial() {
        return containsMaterial;
    }

    public void setContainsMaterial(String containsMaterial) {
        this.containsMaterial = containsMaterial;
    }

    public char getTypeMaterial() {
        return typeMaterial;
    }

    public void setTypeMaterial(char typeMaterial) {
        this.typeMaterial = typeMaterial;
    }
}
