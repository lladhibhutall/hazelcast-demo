package com.scb.hazelcastdemo.server;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class client {
	public static void main(String args[]) {
		HazelcastInstance hz = HazelcastClient.newHazelcastClient();
		IMap<Integer, String> mp = hz.getMap("test-map");
		//mp.put(1, "one");
		System.out.println(mp.get(1));
		hz.shutdown();
		
	}
}
