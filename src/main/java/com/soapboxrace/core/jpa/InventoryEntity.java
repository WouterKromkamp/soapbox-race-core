package com.soapboxrace.core.jpa;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "INVENTORY")
@NamedQueries({
        @NamedQuery(name = "InventoryEntity.findByPersonaId", query = "SELECT obj FROM InventoryEntity obj WHERE obj.personaEntity.id = :personaId")
})
public class InventoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(targetEntity = PersonaEntity.class)
    private PersonaEntity personaEntity;

    @OneToMany(mappedBy = "inventoryEntity", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<InventoryItemEntity> inventoryItems;

    @Column
    private int performancePartsCapacity;

    @Column
    private int performancePartsUsedSlotCount;

    @Column
    private int skillModPartsCapacity;

    @Column
    private int skillModPartsUsedSlotCount;

    @Column
    private int visualPartsCapacity;

    @Column
    private int visualPartsUsedSlotCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonaEntity getPersonaEntity() {
        return personaEntity;
    }

    public void setPersonaEntity(PersonaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }

    public List<InventoryItemEntity> getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(List<InventoryItemEntity> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    public int getPerformancePartsCapacity() {
        return performancePartsCapacity;
    }

    public void setPerformancePartsCapacity(int performancePartsCapacity) {
        this.performancePartsCapacity = performancePartsCapacity;
    }

    public int getPerformancePartsUsedSlotCount() {
        return performancePartsUsedSlotCount;
    }

    public void setPerformancePartsUsedSlotCount(int performancePartsUsedSlotCount) {
        this.performancePartsUsedSlotCount = performancePartsUsedSlotCount;
    }

    public int getSkillModPartsCapacity() {
        return skillModPartsCapacity;
    }

    public void setSkillModPartsCapacity(int skillModPartsCapacity) {
        this.skillModPartsCapacity = skillModPartsCapacity;
    }

    public int getSkillModPartsUsedSlotCount() {
        return skillModPartsUsedSlotCount;
    }

    public void setSkillModPartsUsedSlotCount(int skillModPartsUsedSlotCount) {
        this.skillModPartsUsedSlotCount = skillModPartsUsedSlotCount;
    }

    public int getVisualPartsCapacity() {
        return visualPartsCapacity;
    }

    public void setVisualPartsCapacity(int visualPartsCapacity) {
        this.visualPartsCapacity = visualPartsCapacity;
    }

    public int getVisualPartsUsedSlotCount() {
        return visualPartsUsedSlotCount;
    }

    public void setVisualPartsUsedSlotCount(int visualPartsUsedSlotCount) {
        this.visualPartsUsedSlotCount = visualPartsUsedSlotCount;
    }
}
