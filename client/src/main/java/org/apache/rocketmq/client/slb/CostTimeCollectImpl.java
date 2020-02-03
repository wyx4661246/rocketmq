package org.apache.rocketmq.client.slb;

import org.apache.rocketmq.common.message.MessageQueue;

import java.util.List;

public class CostTimeCollectImpl implements CostTimeCollect{


    @Override
    public void addCostTime(String brokerName, Long costTime) {

    }

    @Override
    public void getBroker(List<MessageQueue> mqs) {
        for (int i = 0; i < mqs.size(); i++) {
            mqs.get(i).getBrokerName();
        }
    }
}
