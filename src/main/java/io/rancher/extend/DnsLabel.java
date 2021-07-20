package io.rancher.extend;

import io.rancher.base.AbstractType;

public class DnsLabel extends AbstractType {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DnsLabel() {
    }

    public DnsLabel(String name) {
        this.name = name;
    }
}
