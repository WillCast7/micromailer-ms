package com.kayzenmicroservices.mailchimp.dtos.response;

import com.kayzenmicroservices.mailchimp.dtos.CampaignDefaultsDTO;
import com.kayzenmicroservices.mailchimp.dtos.ContactDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.audienceList.StatsDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.LinkDTO;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 13/03/2025
 * Descripción:
 */

@Data
public class AudienceCreationResponseDTO {
    private String id;
    private int webId;
    private String name;
    private ContactDTO contact;
    private String permissionReminder;
    private boolean useArchiveBar;
    private CampaignDefaultsDTO campaignDefaults;
    private boolean notifyOnSubscribe;
    private boolean notifyOnUnsubscribe;
    private ZonedDateTime dateCreated;
    private int listRating;
    private boolean emailTypeOption;
    private String subscribeUrlShort;
    private String subscribeUrlLong;
    private String beamerAddress;
    private String visibility;
    private boolean doubleOptin;
    private boolean hasWelcome;
    private boolean marketingPermissions;
    private List<String> modules;
    private StatsDTO stats;
    private List<LinkDTO> links;
}
