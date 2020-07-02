package com.scb.hazelcastdemo.server;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lets see");
		HazelcastInstance hazelcastinstance = Hazelcast.newHazelcastInstance();
	}

}
