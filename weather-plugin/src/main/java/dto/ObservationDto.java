package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObservationDto {

    @JsonProperty("date")
    private DateTimeDto localDateTime;

    @JsonProperty("utcdate")
    private DateTimeDto utcDateTime;

    @JsonProperty("tempm")
    private String tempm;

    @JsonProperty("tempi")
    private String tempi;

    @JsonProperty("dewptm")
    private String dewptm;

    @JsonProperty("dewpti")
    private String dewpti;

    @JsonProperty("hum")
    private String hum;

    @JsonProperty("wspdm")
    private String wspdm;

    @JsonProperty("wspdi")
    private String wspdi;

    @JsonProperty("wgustm")
    private String wgustm;

    @JsonProperty("wgusti")
    private String wgusti;

    @JsonProperty("wdird")
    private String wdird;

    @JsonProperty("wdire")
    private String wdire;

    @JsonProperty("vism")
    private String vism;

    @JsonProperty("visi")
    private String visi;

    @JsonProperty("pressurem")
    private String pressurem;

    @JsonProperty("pressurei")
    private String pressurei;

    @JsonProperty("windchillm")
    private String windchillm;

    @JsonProperty("windchilli")
    private String windchilli;

    @JsonProperty("heatindexm")
    private String heatindexm;

    @JsonProperty("heatindexi")
    private String heatindexi;

    @JsonProperty("precipm")
    private String precipm;

    @JsonProperty("precipi")
    private String precipi;

    @JsonProperty("conds")
    private String conds;

    @JsonProperty("icon")
    private String icon;

    @JsonProperty("fog")
    private String fog;

    @JsonProperty("rain")
    private String rain;

    @JsonProperty("snow")
    private String snow;

    @JsonProperty("hail")
    private String hail;

    @JsonProperty("thunder")
    private String thunder;

    @JsonProperty("tornado")
    private String tornado;

    @JsonProperty("metar")
    private String metar;

    public DateTimeDto getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(DateTimeDto localDateTime) {
        this.localDateTime = localDateTime;
    }

    public DateTimeDto getUtcDateTime() {
        return utcDateTime;
    }

    public void setUtcDateTime(DateTimeDto utcDateTime) {
        this.utcDateTime = utcDateTime;
    }

    public String getTempm() {
        return tempm;
    }

    public void setTempm(String tempm) {
        this.tempm = tempm;
    }

    public String getTempi() {
        return tempi;
    }

    public void setTempi(String tempi) {
        this.tempi = tempi;
    }

    public String getDewptm() {
        return dewptm;
    }

    public void setDewptm(String dewptm) {
        this.dewptm = dewptm;
    }

    public String getDewpti() {
        return dewpti;
    }

    public void setDewpti(String dewpti) {
        this.dewpti = dewpti;
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getWspdm() {
        return wspdm;
    }

    public void setWspdm(String wspdm) {
        this.wspdm = wspdm;
    }

    public String getWspdi() {
        return wspdi;
    }

    public void setWspdi(String wspdi) {
        this.wspdi = wspdi;
    }

    public String getWgustm() {
        return wgustm;
    }

    public void setWgustm(String wgustm) {
        this.wgustm = wgustm;
    }

    public String getWgusti() {
        return wgusti;
    }

    public void setWgusti(String wgusti) {
        this.wgusti = wgusti;
    }

    public String getWdird() {
        return wdird;
    }

    public void setWdird(String wdird) {
        this.wdird = wdird;
    }

    public String getWdire() {
        return wdire;
    }

    public void setWdire(String wdire) {
        this.wdire = wdire;
    }

    public String getVism() {
        return vism;
    }

    public void setVism(String vism) {
        this.vism = vism;
    }

    public String getVisi() {
        return visi;
    }

    public void setVisi(String visi) {
        this.visi = visi;
    }

    public String getPressurem() {
        return pressurem;
    }

    public void setPressurem(String pressurem) {
        this.pressurem = pressurem;
    }

    public String getPressurei() {
        return pressurei;
    }

    public void setPressurei(String pressurei) {
        this.pressurei = pressurei;
    }

    public String getWindchillm() {
        return windchillm;
    }

    public void setWindchillm(String windchillm) {
        this.windchillm = windchillm;
    }

    public String getWindchilli() {
        return windchilli;
    }

    public void setWindchilli(String windchilli) {
        this.windchilli = windchilli;
    }

    public String getHeatindexm() {
        return heatindexm;
    }

    public void setHeatindexm(String heatindexm) {
        this.heatindexm = heatindexm;
    }

    public String getHeatindexi() {
        return heatindexi;
    }

    public void setHeatindexi(String heatindexi) {
        this.heatindexi = heatindexi;
    }

    public String getPrecipm() {
        return precipm;
    }

    public void setPrecipm(String precipm) {
        this.precipm = precipm;
    }

    public String getPrecipi() {
        return precipi;
    }

    public void setPrecipi(String precipi) {
        this.precipi = precipi;
    }

    public String getConds() {
        return conds;
    }

    public void setConds(String conds) {
        this.conds = conds;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

    public String getMetar() {
        return metar;
    }

    public void setMetar(String metar) {
        this.metar = metar;
    }
}
