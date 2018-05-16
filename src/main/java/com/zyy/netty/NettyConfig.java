package com.zyy.netty;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/*
 * 整个工程的全局配置
 * */
public class NettyConfig {
    /*
     * 存储每一个客户端接入进来时的channel对象
     * */
    public static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

}
