package com.kayzenmicroservices.mailchimp.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kayzenmicroservices.mailchimp.dtos.request.CampaignCreation.SocialCardDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.*;
import lombok.Data;

import java.time.Instant;
import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 12/03/2025
 * Descripción:
 */

@Data
public class CampaignCreationResponseDTO {

    private String id;

    @JsonProperty("web_id")
    private int webId;

    @JsonProperty("parent_campaign_id")
    private String parentCampaignId;

    private String type;

    @JsonProperty("create_time")
    private String createTime;

    @JsonProperty("archive_url")
    private String archiveUrl;

    @JsonProperty("long_archive_url")
    private String longArchiveUrl;

    private String status;

    @JsonProperty("emails_sent")
    private int emailsSent;

    @JsonProperty("send_time")
    private String sendTime;

    @JsonProperty("content_type")
    private String contentType;

    @JsonProperty("needs_block_refresh")
    private boolean needsBlockRefresh;

    private boolean resendable;

    private RecipientsDTO recipients;

    private SettingsDTO settings;

    @JsonProperty("variate_settings")
    private VariateSettingsDTO variateSettings;

    private TrackingDTO tracking;

    @JsonProperty("rss_opts")
    private RssOptsDTO rssOpts;

    @JsonProperty("ab_split_opts")
    private AbSplitOptsDTO abSplitOpts;

    @JsonProperty("social_card")
    private SocialCardDTO socialCard;

    @JsonProperty("report_summary")
    private ReportSummaryDTO reportSummary;

    @JsonProperty("delivery_status")
    private DeliveryStatusDTO deliveryStatus;

    @JsonProperty("_links")
    private List<LinkDTO> links;
}




