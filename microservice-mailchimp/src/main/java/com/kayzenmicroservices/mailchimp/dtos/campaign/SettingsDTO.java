package com.kayzenmicroservices.mailchimp.dtos.campaign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SettingsDTO {
    @JsonProperty("subject_line")
    private String subjectLine;

    private String title;

    @JsonProperty("from_name")
    private String fromName;

    @JsonProperty("reply_to")
    private String replyTo;

    @JsonProperty("use_conversation")
    private Boolean useConversation;

    @JsonProperty("to_name")
    private String toName;

    @JsonProperty("folder_id")
    private String folderId;

    private Boolean authenticate;

    @JsonProperty("auto_footer")
    private Boolean autoFooter;

    @JsonProperty("inline_css")
    private Boolean inlineCss;

    @JsonProperty("auto_tweet")
    private Boolean autoTweet;

    @JsonProperty("fb_comments")
    private Boolean fbComments;

    private Boolean timewarp;

    @JsonProperty("template_id")
    private Integer templateId;

    @JsonProperty("drag_and_drop")
    private Boolean dragAndDrop;
}
