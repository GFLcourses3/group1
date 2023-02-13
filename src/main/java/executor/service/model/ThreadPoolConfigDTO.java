package executor.service.model;

public class ThreadPoolConfigDTO {
    private Integer corePoolSize;
    private Long keepAliveTime;

    ThreadPoolConfigDTO(){}

    public ThreadPoolConfigDTO(Integer corePoolSize, Long keepAliveTime) {
        this.corePoolSize = corePoolSize;
        this.keepAliveTime = keepAliveTime;
    }

    public Integer getCorePoolSize() {
        return corePoolSize;
    }

    public void setCorePoolSize(Integer corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public Long getKeepAliveTime() {
        return keepAliveTime;
    }

    public void setKeepAliveTime(Long keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ThreadPoolConfigDTO)) return false;

        ThreadPoolConfigDTO that = (ThreadPoolConfigDTO) o;

        if (getCorePoolSize() != null ? !getCorePoolSize().equals(that.getCorePoolSize()) : that.getCorePoolSize() != null)
            return false;
        return getKeepAliveTime() != null ? getKeepAliveTime().equals(that.getKeepAliveTime()) : that.getKeepAliveTime() == null;
    }

    @Override
    public int hashCode() {
        int result = getCorePoolSize() != null ? getCorePoolSize().hashCode() : 0;
        result = 31 * result + (getKeepAliveTime() != null ? getKeepAliveTime().hashCode() : 0);
        return result;
    }
}
