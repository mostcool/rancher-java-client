package io.rancher.extend;

import io.rancher.base.AbstractType;

public class Hostname extends AbstractType {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hostname() {
    }

    public Hostname(String name) {
        this.name = name;
    }
}
