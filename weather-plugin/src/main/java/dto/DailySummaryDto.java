package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DailySummaryDto {

    @JsonProperty("date")
    private DateTimeDto localDateTime;

    @JsonProperty("maxhumidity")
    private String maxHumidity;

    @JsonProperty("precipm")
    private String precipitation;

    @JsonProperty("maxtempm")
    private String maxTemperature;

    @JsonProperty("mintempm")
    private String minTemperature;

    @JsonProperty("fog")
    private String fog;

    @JsonProperty("rain")
    private String rain;

    @JsonProperty("snow")
    private String snow;

    @JsonProperty("snowfallm")
    private String snowfallm;

    @JsonProperty("snowfalli")
    private String snowfalli;

    @JsonProperty("monthtodatesnowfallm")
    private String monthtodatesnowfallm;

    @JsonProperty("monthtodatesnowfalli")
    private String monthtodatesnowfalli;

    @JsonProperty("since1julsnowfallm")
    private String since1julsnowfallm;

    @JsonProperty("since1julsnowfalli")
    private String since1julsnowfalli;

    @JsonProperty("snowdepthm")
    private String snowdepthm;

    @JsonProperty("snowdepthi")
    private String snowdepthi;

    @JsonProperty("hail")
    private String hail;

    @JsonProperty("thunder")
    private String thunder;

    @JsonProperty("tornado")
    private String tornado;

    @JsonProperty("meantempm")
    private String meantempm;

    @JsonProperty("meantempi")
    private String meantempi;

    @JsonProperty("meandewptm")
    private String meandewptm;

    @JsonProperty("meandewpti")
    private String meandewpti;

    @JsonProperty("meanpressurem")
    private String meanpressurem;

    @JsonProperty("meanpressurei")
    private String meanpressurei;

    @JsonProperty("meanwindspdm")
    private String meanwindspdm;

    @JsonProperty("meanwindspdi")
    private String meanwindspdi;

    @JsonProperty("meanwdire")
    private String meanwdire;

    @JsonProperty("meanwdird")
    private String meanwdird;

    @JsonProperty("meanvism")
    private String meanvism;

    @JsonProperty("meanvisi")
    private String meanvisi;

    @JsonProperty("humidity")
    private String humidity;

    @JsonProperty("maxtempi")
    private String maxtempi;

    @JsonProperty("mintempi")
    private String mintempi;

    @JsonProperty("minhumidity")
    private String minhumidity;

    @JsonProperty("maxdewptm")
    private String maxdewptm;

    @JsonProperty("maxdewpti")
    private String maxdewpti;

    @JsonProperty("mindewptm")
    private String mindewptm;

    @JsonProperty("mindewpti")
    private String mindewpti;

    @JsonProperty("maxpressurem")
    private String maxpressurem;

    @JsonProperty("maxpressurei")
    private String maxpressurei;

    @JsonProperty("minpressurem")
    private String minpressurem;

    @JsonProperty("minpressurei")
    private String minpressurei;

    @JsonProperty("maxwspdm")
    private String maxwspdm;

    @JsonProperty("maxwspdi")
    private String maxwspdi;

    @JsonProperty("minwspdm")
    private String minwspdm;

    @JsonProperty("minwspdi")
    private String minwspdi;

    @JsonProperty("maxvism")
    private String maxvism;

    @JsonProperty("maxvisi")
    private String maxvisi;

    @JsonProperty("minvism")
    private String minvism;

    @JsonProperty("minvisi")
    private String minvisi;

    @JsonProperty("gdegreedays")
    private String gdegreedays;

    @JsonProperty("heatingdegreedays")
    private String heatingdegreedays;

    @JsonProperty("coolingdegreedays")
    private String coolingdegreedays;

    @JsonProperty("precipi")
    private String precipi;

    @JsonProperty("precipsource")
    private String precipsource;

    @JsonProperty("heatingdegreedaysnormal")
    private String heatingdegreedaysnormal;

    @JsonProperty("monthtodateheatingdegreedays")
    private String monthtodateheatingdegreedays;

    @JsonProperty("monthtodateheatingdegreedaysnormal")
    private String monthtodateheatingdegreedaysnormal;

    @JsonProperty("since1sepheatingdegreedays")
    private String since1sepheatingdegreedays;

    @JsonProperty("since1sepheatingdegreedaysnormal")
    private String since1sepheatingdegreedaysnormal;

    @JsonProperty("since1julheatingdegreedays")
    private String since1julheatingdegreedays;

    @JsonProperty("since1julheatingdegreedaysnormal")
    private String since1julheatingdegreedaysnormal;

    @JsonProperty("coolingdegreedaysnormal")
    private String coolingdegreedaysnormal;

    @JsonProperty("monthtodatecoolingdegreedays")
    private String monthtodatecoolingdegreedays;

    @JsonProperty("monthtodatecoolingdegreedaysnormal")
    private String monthtodatecoolingdegreedaysnormal;

    @JsonProperty("since1sepcoolingdegreedays")
    private String since1sepcoolingdegreedays;

    @JsonProperty("since1sepcoolingdegreedaysnormal")
    private String since1sepcoolingdegreedaysnormal;

    @JsonProperty("since1jancoolingdegreedays")
    private String since1jancoolingdegreedays;

    @JsonProperty("since1jancoolingdegreedaysnormal")
    private String since1jancoolingdegreedaysnormal;

    public String getMaxHumidity() {
        return maxHumidity;
    }

    public void setMaxHumidity(String maxHumidity) {
        this.maxHumidity = maxHumidity;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(String maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public String getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(String minTemperature) {
        this.minTemperature = minTemperature;
    }

    public DateTimeDto getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(DateTimeDto localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getFog() {
        return fog;
    }

    public void setFog(String fog) {
        this.fog = fog;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getSnow() {
        return snow;
    }

    public void setSnow(String snow) {
        this.snow = snow;
    }

    public String getSnowfallm() {
        return snowfallm;
    }

    public void setSnowfallm(String snowfallm) {
        this.snowfallm = snowfallm;
    }

    public String getSnowfalli() {
        return snowfalli;
    }

    public void setSnowfalli(String snowfalli) {
        this.snowfalli = snowfalli;
    }

    public String getMonthtodatesnowfallm() {
        return monthtodatesnowfallm;
    }

    public void setMonthtodatesnowfallm(String monthtodatesnowfallm) {
        this.monthtodatesnowfallm = monthtodatesnowfallm;
    }

    public String getMonthtodatesnowfalli() {
        return monthtodatesnowfalli;
    }

    public void setMonthtodatesnowfalli(String monthtodatesnowfalli) {
        this.monthtodatesnowfalli = monthtodatesnowfalli;
    }

    public String getSince1julsnowfallm() {
        return since1julsnowfallm;
    }

    public void setSince1julsnowfallm(String since1julsnowfallm) {
        this.since1julsnowfallm = since1julsnowfallm;
    }

    public String getSince1julsnowfalli() {
        return since1julsnowfalli;
    }

    public void setSince1julsnowfalli(String since1julsnowfalli) {
        this.since1julsnowfalli = since1julsnowfalli;
    }

    public String getSnowdepthm() {
        return snowdepthm;
    }

    public void setSnowdepthm(String snowdepthm) {
        this.snowdepthm = snowdepthm;
    }

    public String getSnowdepthi() {
        return snowdepthi;
    }

    public void setSnowdepthi(String snowdepthi) {
        this.snowdepthi = snowdepthi;
    }

    public String getHail() {
        return hail;
    }

    public void setHail(String hail) {
        this.hail = hail;
    }

    public String getThunder() {
        return thunder;
    }

    public void setThunder(String thunder) {
        this.thunder = thunder;
    }

    public String getTornado() {
        return tornado;
    }

    public void setTornado(String tornado) {
        this.tornado = tornado;
    }

    public String getMeantempm() {
        return meantempm;
    }

    public void setMeantempm(String meantempm) {
        this.meantempm = meantempm;
    }

    public String getMeantempi() {
        return meantempi;
    }

    public void setMeantempi(String meantempi) {
        this.meantempi = meantempi;
    }

    public String getMeandewptm() {
        return meandewptm;
    }

    public void setMeandewptm(String meandewptm) {
        this.meandewptm = meandewptm;
    }

    public String getMeandewpti() {
        return meandewpti;
    }

    public void setMeandewpti(String meandewpti) {
        this.meandewpti = meandewpti;
    }

    public String getMeanpressurem() {
        return meanpressurem;
    }

    public void setMeanpressurem(String meanpressurem) {
        this.meanpressurem = meanpressurem;
    }

    public String getMeanpressurei() {
        return meanpressurei;
    }

    public void setMeanpressurei(String meanpressurei) {
        this.meanpressurei = meanpressurei;
    }

    public String getMeanwindspdm() {
        return meanwindspdm;
    }

    public void setMeanwindspdm(String meanwindspdm) {
        this.meanwindspdm = meanwindspdm;
    }

    public String getMeanwindspdi() {
        return meanwindspdi;
    }

    public void setMeanwindspdi(String meanwindspdi) {
        this.meanwindspdi = meanwindspdi;
    }

    public String getMeanwdire() {
        return meanwdire;
    }

    public void setMeanwdire(String meanwdire) {
        this.meanwdire = meanwdire;
    }

    public String getMeanwdird() {
        return meanwdird;
    }

    public void setMeanwdird(String meanwdird) {
        this.meanwdird = meanwdird;
    }

    public String getMeanvism() {
        return meanvism;
    }

    public void setMeanvism(String meanvism) {
        this.meanvism = meanvism;
    }

    public String getMeanvisi() {
        return meanvisi;
    }

    public void setMeanvisi(String meanvisi) {
        this.meanvisi = meanvisi;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getMaxtempi() {
        return maxtempi;
    }

    public void setMaxtempi(String maxtempi) {
        this.maxtempi = maxtempi;
    }

    public String getMintempi() {
        return mintempi;
    }

    public void setMintempi(String mintempi) {
        this.mintempi = mintempi;
    }

    public String getMinhumidity() {
        return minhumidity;
    }

    public void setMinhumidity(String minhumidity) {
        this.minhumidity = minhumidity;
    }

    public String getMaxdewptm() {
        return maxdewptm;
    }

    public void setMaxdewptm(String maxdewptm) {
        this.maxdewptm = maxdewptm;
    }

    public String getMaxdewpti() {
        return maxdewpti;
    }

    public void setMaxdewpti(String maxdewpti) {
        this.maxdewpti = maxdewpti;
    }

    public String getMindewptm() {
        return mindewptm;
    }

    public void setMindewptm(String mindewptm) {
        this.mindewptm = mindewptm;
    }

    public String getMindewpti() {
        return mindewpti;
    }

    public void setMindewpti(String mindewpti) {
        this.mindewpti = mindewpti;
    }

    public String getMaxpressurem() {
        return maxpressurem;
    }

    public void setMaxpressurem(String maxpressurem) {
        this.maxpressurem = maxpressurem;
    }

    public String getMaxpressurei() {
        return maxpressurei;
    }

    public void setMaxpressurei(String maxpressurei) {
        this.maxpressurei = maxpressurei;
    }

    public String getMinpressurem() {
        return minpressurem;
    }

    public void setMinpressurem(String minpressurem) {
        this.minpressurem = minpressurem;
    }

    public String getMinpressurei() {
        return minpressurei;
    }

    public void setMinpressurei(String minpressurei) {
        this.minpressurei = minpressurei;
    }

    public String getMaxwspdm() {
        return maxwspdm;
    }

    public void setMaxwspdm(String maxwspdm) {
        this.maxwspdm = maxwspdm;
    }

    public String getMaxwspdi() {
        return maxwspdi;
    }

    public void setMaxwspdi(String maxwspdi) {
        this.maxwspdi = maxwspdi;
    }

    public String getMinwspdm() {
        return minwspdm;
    }

    public void setMinwspdm(String minwspdm) {
        this.minwspdm = minwspdm;
    }

    public String getMinwspdi() {
        return minwspdi;
    }

    public void setMinwspdi(String minwspdi) {
        this.minwspdi = minwspdi;
    }

    public String getMaxvism() {
        return maxvism;
    }

    public void setMaxvism(String maxvism) {
        this.maxvism = maxvism;
    }

    public String getMaxvisi() {
        return maxvisi;
    }

    public void setMaxvisi(String maxvisi) {
        this.maxvisi = maxvisi;
    }

    public String getMinvism() {
        return minvism;
    }

    public void setMinvism(String minvism) {
        this.minvism = minvism;
    }

    public String getMinvisi() {
        return minvisi;
    }

    public void setMinvisi(String minvisi) {
        this.minvisi = minvisi;
    }

    public String getGdegreedays() {
        return gdegreedays;
    }

    public void setGdegreedays(String gdegreedays) {
        this.gdegreedays = gdegreedays;
    }

    public String getHeatingdegreedays() {
        return heatingdegreedays;
    }

    public void setHeatingdegreedays(String heatingdegreedays) {
        this.heatingdegreedays = heatingdegreedays;
    }

    public String getCoolingdegreedays() {
        return coolingdegreedays;
    }

    public void setCoolingdegreedays(String coolingdegreedays) {
        this.coolingdegreedays = coolingdegreedays;
    }

    public String getPrecipi() {
        return precipi;
    }

    public void setPrecipi(String precipi) {
        this.precipi = precipi;
    }

    public String getPrecipsource() {
        return precipsource;
    }

    public void setPrecipsource(String precipsource) {
        this.precipsource = precipsource;
    }

    public String getHeatingdegreedaysnormal() {
        return heatingdegreedaysnormal;
    }

    public void setHeatingdegreedaysnormal(String heatingdegreedaysnormal) {
        this.heatingdegreedaysnormal = heatingdegreedaysnormal;
    }

    public String getMonthtodateheatingdegreedays() {
        return monthtodateheatingdegreedays;
    }

    public void setMonthtodateheatingdegreedays(String monthtodateheatingdegreedays) {
        this.monthtodateheatingdegreedays = monthtodateheatingdegreedays;
    }

    public String getMonthtodateheatingdegreedaysnormal() {
        return monthtodateheatingdegreedaysnormal;
    }

    public void setMonthtodateheatingdegreedaysnormal(String monthtodateheatingdegreedaysnormal) {
        this.monthtodateheatingdegreedaysnormal = monthtodateheatingdegreedaysnormal;
    }

    public String getSince1sepheatingdegreedays() {
        return since1sepheatingdegreedays;
    }

    public void setSince1sepheatingdegreedays(String since1sepheatingdegreedays) {
        this.since1sepheatingdegreedays = since1sepheatingdegreedays;
    }

    public String getSince1sepheatingdegreedaysnormal() {
        return since1sepheatingdegreedaysnormal;
    }

    public void setSince1sepheatingdegreedaysnormal(String since1sepheatingdegreedaysnormal) {
        this.since1sepheatingdegreedaysnormal = since1sepheatingdegreedaysnormal;
    }

    public String getSince1julheatingdegreedays() {
        return since1julheatingdegreedays;
    }

    public void setSince1julheatingdegreedays(String since1julheatingdegreedays) {
        this.since1julheatingdegreedays = since1julheatingdegreedays;
    }

    public String getSince1julheatingdegreedaysnormal() {
        return since1julheatingdegreedaysnormal;
    }

    public void setSince1julheatingdegreedaysnormal(String since1julheatingdegreedaysnormal) {
        this.since1julheatingdegreedaysnormal = since1julheatingdegreedaysnormal;
    }

    public String getCoolingdegreedaysnormal() {
        return coolingdegreedaysnormal;
    }

    public void setCoolingdegreedaysnormal(String coolingdegreedaysnormal) {
        this.coolingdegreedaysnormal = coolingdegreedaysnormal;
    }

    public String getMonthtodatecoolingdegreedays() {
        return monthtodatecoolingdegreedays;
    }

    public void setMonthtodatecoolingdegreedays(String monthtodatecoolingdegreedays) {
        this.monthtodatecoolingdegreedays = monthtodatecoolingdegreedays;
    }

    public String getMonthtodatecoolingdegreedaysnormal() {
        return monthtodatecoolingdegreedaysnormal;
    }

    public void setMonthtodatecoolingdegreedaysnormal(String monthtodatecoolingdegreedaysnormal) {
        this.monthtodatecoolingdegreedaysnormal = monthtodatecoolingdegreedaysnormal;
    }

    public String getSince1sepcoolingdegreedays() {
        return since1sepcoolingdegreedays;
    }

    public void setSince1sepcoolingdegreedays(String since1sepcoolingdegreedays) {
        this.since1sepcoolingdegreedays = since1sepcoolingdegreedays;
    }

    public String getSince1sepcoolingdegreedaysnormal() {
        return since1sepcoolingdegreedaysnormal;
    }

    public void setSince1sepcoolingdegreedaysnormal(String since1sepcoolingdegreedaysnormal) {
        this.since1sepcoolingdegreedaysnormal = since1sepcoolingdegreedaysnormal;
    }

    public String getSince1jancoolingdegreedays() {
        return since1jancoolingdegreedays;
    }

    public void setSince1jancoolingdegreedays(String since1jancoolingdegreedays) {
        this.since1jancoolingdegreedays = since1jancoolingdegreedays;
    }

    public String getSince1jancoolingdegreedaysnormal() {
        return since1jancoolingdegreedaysnormal;
    }

    public void setSince1jancoolingdegreedaysnormal(String since1jancoolingdegreedaysnormal) {
        this.since1jancoolingdegreedaysnormal = since1jancoolingdegreedaysnormal;
    }

    @Override
    public String toString() {
        return "maxHumidity = " + maxHumidity + "\n" +
                "maxTemperature = " + maxTemperature + "\n" +
                "minTemperature = " + minTemperature + "\n" +
                "precipitation = " + precipitation + "\n";
    }
}
