package com.github.junit5docker;

import java.util.Objects;

final class PortBinding {

    final int exposed;

    final int inner;

    PortBinding(int exposed, int inner) {
        this.exposed = exposed;
        this.inner = inner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PortBinding that = (PortBinding) o;
        return exposed == that.exposed
                && inner == that.inner;
    }

    @Override
    public int hashCode() {
        return Objects.hash(exposed, inner);
    }
}
