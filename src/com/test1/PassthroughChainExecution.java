package com.test1;

public class PassthroughChainExecution {
	private long chainExecutionId;
	private long passthroughChainConfigurationId;
	private String sessionId;
	private String executionId;
	private String chainName;
	private String executionMode;
	private String inputPayload;
	private String originalInput;
	private String passthroughOutput;
	private String assignedOutput;
	private String transformerOutput;
	private String finalOutput;
	private String executedComponents;
	private long parallelBranchCount;
	private long successfulBranchCount;
	private long failedBranchCount;
	private String executionStartTime;
	private String executionEndTime;

	public PassthroughChainExecution() {

	}

	public PassthroughChainExecution(long chainExecutionId, long passthroughChainConfigurationId, String sessionId,
			String executionId, String chainName, String executionMode, String inputPayload, String originalInput,
			String passthroughOutput, String assignedOutput, String transformerOutput, String finalOutput,
			String executedComponents, long parallelBranchCount, long successfulBranchCount, long failedBranchCount,
			String executionStartTime, String executionEndTime) {
		super();
		this.chainExecutionId = chainExecutionId;
		this.passthroughChainConfigurationId = passthroughChainConfigurationId;
		this.sessionId = sessionId;
		this.executionId = executionId;
		this.chainName = chainName;
		this.executionMode = executionMode;
		this.inputPayload = inputPayload;
		this.originalInput = originalInput;
		this.passthroughOutput = passthroughOutput;
		this.assignedOutput = assignedOutput;
		this.transformerOutput = transformerOutput;
		this.finalOutput = finalOutput;
		this.executedComponents = executedComponents;
		this.parallelBranchCount = parallelBranchCount;
		this.successfulBranchCount = successfulBranchCount;
		this.failedBranchCount = failedBranchCount;
		this.executionStartTime = executionStartTime;
		this.executionEndTime = executionEndTime;
	}

	public long getChainExecutionId() {
		return chainExecutionId;
	}

	public void setChainExecutionId(long chainExecutionId) {
		this.chainExecutionId = chainExecutionId;
	}

	public long getPassthroughChainConfigurationId() {
		return passthroughChainConfigurationId;
	}

	public void setPassthroughChainConfigurationId(long passthroughChainConfigurationId) {
		this.passthroughChainConfigurationId = passthroughChainConfigurationId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public String getChainName() {
		return chainName;
	}

	public void setChainName(String chainName) {
		this.chainName = chainName;
	}

	public String getExecutionMode() {
		return executionMode;
	}

	public void setExecutionMode(String executionMode) {
		this.executionMode = executionMode;
	}

	public String getInputPayload() {
		return inputPayload;
	}

	public void setInputPayload(String inputPayload) {
		this.inputPayload = inputPayload;
	}

	public String getOriginalInput() {
		return originalInput;
	}

	public void setOriginalInput(String originalInput) {
		this.originalInput = originalInput;
	}

	public String getPassthroughOutput() {
		return passthroughOutput;
	}

	public void setPassthroughOutput(String passthroughOutput) {
		this.passthroughOutput = passthroughOutput;
	}

	public String getAssignedOutput() {
		return assignedOutput;
	}

	public void setAssignedOutput(String assignedOutput) {
		this.assignedOutput = assignedOutput;
	}

	public String getTransformerOutput() {
		return transformerOutput;
	}

	public void setTransformerOutput(String transformerOutput) {
		this.transformerOutput = transformerOutput;
	}

	public String getFinalOutput() {
		return finalOutput;
	}

	public void setFinalOutput(String finalOutput) {
		this.finalOutput = finalOutput;
	}

	public String getExecutedComponents() {
		return executedComponents;
	}

	public void setExecutedComponents(String executedComponents) {
		this.executedComponents = executedComponents;
	}

	public long getParallelBranchCount() {
		return parallelBranchCount;
	}

	public void setParallelBranchCount(long parallelBranchCount) {
		this.parallelBranchCount = parallelBranchCount;
	}

	public long getSuccessfulBranchCount() {
		return successfulBranchCount;
	}

	public void setSuccessfulBranchCount(long successfulBranchCount) {
		this.successfulBranchCount = successfulBranchCount;
	}

	public long getFailedBranchCount() {
		return failedBranchCount;
	}

	public void setFailedBranchCount(long failedBranchCount) {
		this.failedBranchCount = failedBranchCount;
	}

	public String getExecutionStartTime() {
		return executionStartTime;
	}

	public void setExecutionStartTime(String executionStartTime) {
		this.executionStartTime = executionStartTime;
	}

	public String getExecutionEndTime() {
		return executionEndTime;
	}

	public void setExecutionEndTime(String executionEndTime) {
		this.executionEndTime = executionEndTime;
	}

}
