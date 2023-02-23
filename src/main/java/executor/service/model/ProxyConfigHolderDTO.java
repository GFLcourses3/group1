package executor.service.model;

import java.util.Objects;

public class ProxyConfigHolderDTO {
    private ProxyNetworkConfigDTO proxyNetworkConfig;
    private ProxyCredentials proxyCredentials;

    public ProxyConfigHolderDTO() {}

    public ProxyConfigHolderDTO(ProxyNetworkConfigDTO proxyNetworkConfig, ProxyCredentials proxyCredentials) {
        this.proxyNetworkConfig = proxyNetworkConfig;
        this.proxyCredentials = proxyCredentials;
    }

    public ProxyNetworkConfigDTO getProxyNetworkConfig() {
        return proxyNetworkConfig;
    }

    public void setProxyNetworkConfig(ProxyNetworkConfigDTO proxyNetworkConfig) {
        this.proxyNetworkConfig = proxyNetworkConfig;
    }

    public ProxyCredentials getProxyCredentials() {
        return proxyCredentials;
    }

    public void setProxyCredentials(ProxyCredentials proxyCredentials) {
        this.proxyCredentials = proxyCredentials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProxyConfigHolderDTO proxyConfigHolder = (ProxyConfigHolderDTO) o;
        return Objects.equals(proxyNetworkConfig, proxyConfigHolder.proxyNetworkConfig) && Objects.equals(proxyCredentials, proxyConfigHolder.proxyCredentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proxyNetworkConfig, proxyCredentials);
    }
}
