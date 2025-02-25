package com.kayzenmicroservices.mailchimp.dtos.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RecipientsDTO {
    @JsonProperty("list_id")
    private String listId;

    @JsonProperty("list_is_active")
    private Boolean listIsActive;

    @JsonProperty("list_name")
    private String listName;

    @JsonProperty("segment_text")
    private String segmentText;

    @JsonProperty("recipient_count")
    private Integer recipientCount;

    @JsonProperty("segment_opts")
    private SegmentOptsDTO segmentOpts;
}
