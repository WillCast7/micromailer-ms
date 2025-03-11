package com.kayzenmicroservices.mailchimp.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kayzenmicroservices.mailchimp.dtos.response.memberAudience.StatsDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.memberAudience.LinkDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.memberAudience.LocationDTO;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Autor: William Castaño ;)
 * Fecha: 10/03/2025
 * Descripción:
 */

@Data
public class AudienceMembersDTO {

    private String id;

    @JsonProperty("email_address")
    private String emailAddress;

    @JsonProperty("unique_email_id")
    private String uniqueEmailId;

    @JsonProperty("contact_id")
    private String contactId;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("web_id")
    private int webId;

    @JsonProperty("email_type")
    private String emailType;

    private String status;

    @JsonProperty("consents_to_one_to_one_messaging")
    private boolean consentsToOneToOneMessaging;

    @JsonProperty("sms_phone_number")
    private String smsPhoneNumber;

    @JsonProperty("sms_subscription_status")
    private String smsSubscriptionStatus;

    @JsonProperty("sms_subscription_last_updated")
    private String smsSubscriptionLastUpdated;

    @JsonProperty("merge_fields")
    private Map<String, Object> mergeFields;

    private Map<String, Boolean> interests;

    private StatsDTO stats;

    @JsonProperty("ip_signup")
    private String ipSignup;

    @JsonProperty("timestamp_signup")
    private String timestampSignup;

    @JsonProperty("ip_opt")
    private String ipOpt;

    @JsonProperty("timestamp_opt")
    private String timestampOpt;

    @JsonProperty("member_rating")
    private int memberRating;

    @JsonProperty("last_changed")
    private String lastChanged;

    private String language;

    private boolean vip;

    @JsonProperty("email_client")
    private String emailClient;

    private LocationDTO location;

    private String source;

    @JsonProperty("tags_count")
    private int tagsCount;

    private List<String> tags;

    @JsonProperty("list_id")
    private String listId;

    @JsonProperty("_links")
    private List<LinkDTO> links;

}
