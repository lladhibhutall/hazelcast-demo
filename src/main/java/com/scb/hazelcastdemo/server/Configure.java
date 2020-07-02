package com.scb.hazelcastdemo.server;

import java.sql.NClob;

import com.hazelcast.config.Config;
import com.hazelcast.config.JoinConfig;
import com.hazelcast.config.NetworkConfig;

public class Configure {
	public 	static Config getconfig(){
	Config config = new Config();
	NetworkConfig network = config.getNetworkConfig();
	network.setPort(5701).setPortCount(20);
	network.setPortAutoIncrement(true);
	JoinConfig join = network.getJoin();
	join.getMulticastConfig().setEnabled(false);
	join.getTcpIpConfig().addMember("localhost").setEnabled(true);
	
	return config;
	}
}
