package io.rancher.extend;

import io.rancher.base.AbstractType;

public class Password extends AbstractType {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Password() {
    }

    public Password(String password) {
        this.password = password;
    }
}
