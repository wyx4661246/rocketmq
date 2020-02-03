package org.apache.rocketmq.store.index;

import org.apache.rocketmq.common.constant.LoggerName;
import org.apache.rocketmq.logging.InternalLogger;
import org.apache.rocketmq.logging.InternalLoggerFactory;
import org.apache.rocketmq.store.MappedFile;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class BTreeIndex {

    private static final InternalLogger log = InternalLoggerFactory.getLogger(LoggerName.STORE_LOGGER_NAME);

    private final FileChannel fileChannel;
    private final MappedByteBuffer mappedByteBuffer;
    private final MappedFile mappedFile;


    public BTreeIndex() throws IOException {
        this.mappedFile = new MappedFile("", 100);
        this.fileChannel = this.mappedFile.getFileChannel();
        this.mappedByteBuffer = this.mappedFile.getMappedByteBuffer();
    }

    public String getFileName() {
        return this.mappedFile.getFileName();
    }
}
