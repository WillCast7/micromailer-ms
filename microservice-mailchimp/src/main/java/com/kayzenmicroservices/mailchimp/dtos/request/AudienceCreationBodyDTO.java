package com.kayzenmicroservices.mailchimp.dtos.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kayzenmicroservices.mailchimp.dtos.CampaignDefaultsDTO;
import com.kayzenmicroservices.mailchimp.dtos.ContactDTO;
import lombok.Data;

/**
 * Autor: William Castaño ;)
 * Fecha: 3/03/2025
 * Descripción: this is the body for  creation of a  audience
 */

@Data
public class AudienceCreationBodyDTO {

    private String name;

    @JsonProperty("permission_reminder")
    private String permissionReminder;

    @JsonProperty("email_type_option")
    private boolean emailTypeOption;

    @JsonProperty("use_archive_bar")
    private boolean useArchiveBar;

    @JsonProperty("notify_on_subscribe")
    private String notifyOnSubscribe;

    @JsonProperty("notify_on_unsubscribe")
    private String notifyOnUnsubscribe;

    @JsonProperty("double_optin")
    private boolean doubleOptin;

    @JsonProperty("marketing_permissions")
    private boolean marketingPermissions;

    private ContactDTO contact;

    @JsonProperty("campaign_defaults")
    private CampaignDefaultsDTO campaignDefaults;

}
