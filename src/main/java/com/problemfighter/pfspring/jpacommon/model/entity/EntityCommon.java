package com.problemfighter.pfspring.jpacommon.model.entity;

import com.problemfighter.pfspring.common.common.AppCommonUtil;
import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class EntityCommon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Temporal(value = TemporalType.TIMESTAMP)
    public Date created;

    @Temporal(value = TemporalType.TIMESTAMP)
    public Date lastUpdated;

    @Column(unique = true)
    public String uuid;

    public Boolean isDeleted = false;

    @PrePersist
    private void onBasePersist() {
        this.created = new Date();
        this.lastUpdated = new Date();
        if (this.uuid == null || this.uuid.isEmpty()) {
            this.uuid = AppCommonUtil.uuid();
        }
    }

    @PreUpdate
    private void onBaseUpdate() {
        this.lastUpdated = new Date();
    }
}
