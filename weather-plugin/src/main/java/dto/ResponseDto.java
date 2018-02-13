package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDto {

    @JsonProperty("version")
    private String version;

    @JsonProperty("termsofService")
    private String termsOfService;

    @JsonProperty("features")
    private FeaturesDto features;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTermsOfService() {
        return termsOfService;
    }

    public void setTermsOfService(String termsOfService) {
        this.termsOfService = termsOfService;
    }

    public FeaturesDto getFeatures() {
        return features;
    }

    public void setFeatures(FeaturesDto features) {
        this.features = features;
    }
}
