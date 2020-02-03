package org.apache.rocketmq.client.slb;

import org.apache.rocketmq.common.message.MessageQueue;

import java.util.List;

public interface CostTimeCollect {

    void addCostTime(String brokerName, Long costTime);

    void getBroker(List<MessageQueue> mqs);
}
