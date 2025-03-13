package com.kayzenmicroservices.mailchimp.dtos.request.CampaignCreation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 4/03/2025
 * Descripción:
 */
@Data
public class SettingsDTO {

    @JsonProperty("subject_line")
    private String subjectLine;

//    @JsonProperty("preview_text")
//    private String previewText;

    private String title;

    @JsonProperty("from_name")
    private String fromName;

    @JsonProperty("reply_to")
    private String replyTo;

    @JsonProperty("use_conversation")
    private boolean useConversation;

//    @JsonProperty("to_name")
//    private String toName;

//    @JsonProperty("folder_id")
//    private String folderId;

   // private boolean authenticate;

//    @JsonProperty("auto_footer")
//    private boolean autoFooter;
//
//    @JsonProperty("inline_css")
//    private boolean inlineCss;
//
//    @JsonProperty("auto_tweet")
//    private boolean autoTweet;
//
//    @JsonProperty("auto_fb_post")
//    private List<String> autoFbPost;
//
//    @JsonProperty("fb_comments")
//    private boolean fbComments;

    @JsonProperty("template_id")
    private int templateId;
}
