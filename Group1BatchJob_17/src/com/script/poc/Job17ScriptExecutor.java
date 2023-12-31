package com.script.poc;

import java.io.IOException;

public class Job17ScriptExecutor {

	public static void main(String[] args) {
		try {
			String scriptPath = "/home/udayvarma/Batch-jobs/Group1BatchJob_17/script/RxNormPullDelta.sh";
			ProcessBuilder processBuilder = new ProcessBuilder("bash", scriptPath);
			Process process = processBuilder.start();
			int existCode = process.waitFor();
			if(existCode == 0)
				System.out.println("File moved successfully");
			else 
				System.out.println("Failed moving the file");
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
