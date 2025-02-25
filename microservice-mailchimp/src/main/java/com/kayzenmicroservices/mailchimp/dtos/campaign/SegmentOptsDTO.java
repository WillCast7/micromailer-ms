package com.kayzenmicroservices.mailchimp.dtos.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class SegmentOptsDTO {
    @JsonProperty("saved_segment_id")
    private Integer savedSegmentId;

    private String match;
    private List<ConditionDTO> conditions;
}
