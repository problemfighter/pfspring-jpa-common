package com.problemfighter.pfspring.jpacommon.model.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DTOCommon {

    @JsonIgnore
    public Long id;

    @JsonIgnore
    public String uuid;

    @JsonIgnore
    public Date created;

    @JsonIgnore
    public Date lastUpdated;

}
