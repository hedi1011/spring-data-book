package com.oreilly.springdata.hadoop.hive;

import java.util.Collection;

public interface PasswordRepository {

	public abstract void processPasswordFile(String inputFile,
			String outDirectory);

	public abstract void processPasswordFiles(Collection<String> inputFiles,
			String baseOutputDirectory);

}