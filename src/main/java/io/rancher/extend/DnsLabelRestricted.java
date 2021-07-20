package io.rancher.extend;

import io.rancher.base.AbstractType;

public class DnsLabelRestricted extends AbstractType {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DnsLabelRestricted() {
    }

    public DnsLabelRestricted(String name) {
        this.name = name;
    }
}
