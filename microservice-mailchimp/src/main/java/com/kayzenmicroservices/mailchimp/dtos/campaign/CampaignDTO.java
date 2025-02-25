package com.kayzenmicroservices.mailchimp.dtos.campaign;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: this is the principal DTO
 */

@Data
public class CampaignDTO {
    private String id;

    @JsonProperty("web_id")
    private Integer webId;

    private String type;

    @JsonProperty("create_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private ZonedDateTime createTime;

    @JsonProperty("archive_url")
    private String archiveUrl;

    @JsonProperty("long_archive_url")
    private String longArchiveUrl;

    private String status;

    @JsonProperty("emails_sent")
    private Integer emailsSent;

    @JsonProperty("send_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private ZonedDateTime sendTime;

    @JsonProperty("content_type")
    private String contentType;

    @JsonProperty("needs_block_refresh")
    private Boolean needsBlockRefresh;

    private Boolean resendable;

    private RecipientsDTO recipients;
    private SettingsDTO settings;
    private TrackingDTO tracking;

    @JsonProperty("report_summary")
    private ReportSummaryDTO reportSummary;

    @JsonProperty("delivery_status")
    private DeliveryStatusDTO deliveryStatus;

    @JsonProperty("_links")
    private List<LinkDTO> links;
}
