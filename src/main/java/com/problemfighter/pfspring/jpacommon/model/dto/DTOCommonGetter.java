package com.problemfighter.pfspring.jpacommon.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public interface DTOCommonGetter {

    @JsonProperty
    Long getId();

    @JsonProperty
    String getUuid();

    @JsonProperty
    public Date getCreated();

    @JsonProperty
    Date getLastUpdated();
}
