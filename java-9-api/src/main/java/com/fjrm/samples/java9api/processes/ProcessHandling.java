package com.fjrm.samples.java9api.processes;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class ProcessHandling {
	public void handle() {
		ProcessHandle self = ProcessHandle.current();
		long PID = self.pid();
		ProcessHandle.Info procInfo = self.info();
		  
		Optional<String[]> args = procInfo.arguments();
		Optional<String> cmd =  procInfo.commandLine();
		Optional<Instant> startTime = procInfo.startInstant();
		Optional<Duration> cpuUsage = procInfo.totalCpuDuration();
		System.out.println(PID);
		System.out.println(args);
		System.out.println(cmd);
		System.out.println(startTime);
		System.out.println(cpuUsage);
	}
	
	public static void main(String[] args) {
		new ProcessHandling().handle();
	}
}
