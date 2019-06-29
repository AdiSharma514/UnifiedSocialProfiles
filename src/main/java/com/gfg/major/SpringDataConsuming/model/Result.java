package com.gfg.major.SpringDataConsuming.model;

import com.fasterxml.jackson.annotation.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "contribution",
        "lastOnlineTimeSeconds",
        "friendOfCount",
        "titlePhoto",
        "handle",
        "avatar",
        "registrationTimeSeconds"
})
@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class Result {
    @JsonProperty("contribution")
    private Integer contribution;
    @JsonProperty("lastOnlineTimeSeconds")
    private Integer lastOnlineTimeSeconds;
    @JsonProperty("friendOfCount")
    private Integer friendOfCount;
    @JsonProperty("titlePhoto")
    private String titlePhoto;
    @JsonProperty("handle")
    private String handle;
    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("registrationTimeSeconds")
    private Integer registrationTimeSeconds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("contribution")
    public Integer getContribution() {
        return contribution;
    }

    @JsonProperty("contribution")
    public void setContribution(Integer contribution) {
        this.contribution = contribution;
    }

    @JsonProperty("lastOnlineTimeSeconds")
    public Integer getLastOnlineTimeSeconds() {
        return lastOnlineTimeSeconds;
    }

    @JsonProperty("lastOnlineTimeSeconds")
    public void setLastOnlineTimeSeconds(Integer lastOnlineTimeSeconds) {
        this.lastOnlineTimeSeconds = lastOnlineTimeSeconds;
    }

    @JsonProperty("friendOfCount")
    public Integer getFriendOfCount() {
        return friendOfCount;
    }

    @JsonProperty("friendOfCount")
    public void setFriendOfCount(Integer friendOfCount) {
        this.friendOfCount = friendOfCount;
    }

    @JsonProperty("titlePhoto")
    public String getTitlePhoto() {
        return titlePhoto;
    }

    @JsonProperty("titlePhoto")
    public void setTitlePhoto(String titlePhoto) {
        this.titlePhoto = titlePhoto;
    }

    @JsonProperty("handle")
    public String getHandle() {
        return handle;
    }

    @JsonProperty("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    @JsonProperty("avatar")
    public String getAvatar() {
        return avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @JsonProperty("registrationTimeSeconds")
    public Integer getRegistrationTimeSeconds() {
        return registrationTimeSeconds;
    }

    @JsonProperty("registrationTimeSeconds")
    public void setRegistrationTimeSeconds(Integer registrationTimeSeconds) {
        this.registrationTimeSeconds = registrationTimeSeconds;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
