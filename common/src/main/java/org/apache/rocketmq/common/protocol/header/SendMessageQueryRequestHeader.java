package org.apache.rocketmq.common.protocol.header;

import org.apache.rocketmq.remoting.annotation.CFNotNull;

public class SendMessageQueryRequestHeader extends SendMessageRequestHeader {

    @CFNotNull
    private String index;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
