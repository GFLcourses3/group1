package executor.service.model;

public class WebDriverConfigDTO {
    private String webDriverExecutable;
    private String userAgent;
    private Long pageLoadTimeout;
    private Long implicitlyWait;

    public WebDriverConfigDTO() {}

    public WebDriverConfigDTO(String webDriverExecutable, String userAgent, Long pageLoadTimeout, Long implicitlyWait) {
        this.webDriverExecutable = webDriverExecutable;
        this.userAgent = userAgent;
        this.pageLoadTimeout = pageLoadTimeout;
        this.implicitlyWait = implicitlyWait;
    }

    public String getWebDriverExecutable() {
        return webDriverExecutable;
    }

    public void setWebDriverExecutable(String webDriverExecutable) {
        this.webDriverExecutable = webDriverExecutable;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Long getPageLoadTimeout() {
        return pageLoadTimeout;
    }

    public void setPageLoadTimeout(Long pageLoadTimeout) {
        this.pageLoadTimeout = pageLoadTimeout;
    }

    public Long getImplicitlyWait() {
        return implicitlyWait;
    }

    public void setImplicitlyWait(Long implicitlyWait) {
        this.implicitlyWait = implicitlyWait;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebDriverConfigDTO that = (WebDriverConfigDTO) o;
        return webDriverExecutable.equals(that.webDriverExecutable) && userAgent.equals(that.userAgent) && pageLoadTimeout.equals(that.pageLoadTimeout) && implicitlyWait.equals(that.implicitlyWait);
    }

    @Override
    public int hashCode() {
        return Objects.hash(webDriverExecutable, userAgent, pageLoadTimeout, implicitlyWait);
    }
}
