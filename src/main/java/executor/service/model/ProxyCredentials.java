package executor.service.model;

import java.util.Objects;

public class ProxyCredentials {
    private String user;
    private String password;

    public ProxyCredentials(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public ProxyCredentials(){}

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProxyCredentials that = (ProxyCredentials) o;

        if (!Objects.equals(user, that.user)) return false;
        return Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
