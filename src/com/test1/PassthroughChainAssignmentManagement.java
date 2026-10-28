package com.test1;

public class PassthroughChainAssignmentManagement {
	private long assignmentManagementId;
	private long passthroughChainConfigurationId;
	private long chainExecutionId;
	private String assignmentId;
	private String assignmentName;
	private String assignmentType;
	private String sourceInputKeys;
	private String targetOutputKey;
	private String assignedRunnableName;
	private String assignedRunnableType;
	private String assignmentExpression;
	private String assignmentInput;
	private String assignmentOutput;
	private String existingKeysPreserved;
	private String overwriteExistingKey;
	private String parallelAssignmentEnabled;
	private long assignmentPriority;
	private String assignmentStartTime;

	public PassthroughChainAssignmentManagement() {

	}

	public PassthroughChainAssignmentManagement(long assignmentManagementId, long passthroughChainConfigurationId,
			long chainExecutionId, String assignmentId, String assignmentName, String assignmentType,
			String sourceInputKeys, String targetOutputKey, String assignedRunnableName, String assignedRunnableType,
			String assignmentExpression, String assignmentInput, String assignmentOutput, String existingKeysPreserved,
			String overwriteExistingKey, String parallelAssignmentEnabled, long assignmentPriority,
			String assignmentStartTime) {
		super();
		this.assignmentManagementId = assignmentManagementId;
		this.passthroughChainConfigurationId = passthroughChainConfigurationId;
		this.chainExecutionId = chainExecutionId;
		this.assignmentId = assignmentId;
		this.assignmentName = assignmentName;
		this.assignmentType = assignmentType;
		this.sourceInputKeys = sourceInputKeys;
		this.targetOutputKey = targetOutputKey;
		this.assignedRunnableName = assignedRunnableName;
		this.assignedRunnableType = assignedRunnableType;
		this.assignmentExpression = assignmentExpression;
		this.assignmentInput = assignmentInput;
		this.assignmentOutput = assignmentOutput;
		this.existingKeysPreserved = existingKeysPreserved;
		this.overwriteExistingKey = overwriteExistingKey;
		this.parallelAssignmentEnabled = parallelAssignmentEnabled;
		this.assignmentPriority = assignmentPriority;
		this.assignmentStartTime = assignmentStartTime;
	}

	public long getAssignmentManagementId() {
		return assignmentManagementId;
	}

	public void setAssignmentManagementId(long assignmentManagementId) {
		this.assignmentManagementId = assignmentManagementId;
	}

	public long getPassthroughChainConfigurationId() {
		return passthroughChainConfigurationId;
	}

	public void setPassthroughChainConfigurationId(long passthroughChainConfigurationId) {
		this.passthroughChainConfigurationId = passthroughChainConfigurationId;
	}

	public long getChainExecutionId() {
		return chainExecutionId;
	}

	public void setChainExecutionId(long chainExecutionId) {
		this.chainExecutionId = chainExecutionId;
	}

	public String getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(String assignmentId) {
		this.assignmentId = assignmentId;
	}

	public String getAssignmentName() {
		return assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public String getAssignmentType() {
		return assignmentType;
	}

	public void setAssignmentType(String assignmentType) {
		this.assignmentType = assignmentType;
	}

	public String getSourceInputKeys() {
		return sourceInputKeys;
	}

	public void setSourceInputKeys(String sourceInputKeys) {
		this.sourceInputKeys = sourceInputKeys;
	}

	public String getTargetOutputKey() {
		return targetOutputKey;
	}

	public void setTargetOutputKey(String targetOutputKey) {
		this.targetOutputKey = targetOutputKey;
	}

	public String getAssignedRunnableName() {
		return assignedRunnableName;
	}

	public void setAssignedRunnableName(String assignedRunnableName) {
		this.assignedRunnableName = assignedRunnableName;
	}

	public String getAssignedRunnableType() {
		return assignedRunnableType;
	}

	public void setAssignedRunnableType(String assignedRunnableType) {
		this.assignedRunnableType = assignedRunnableType;
	}

	public String getAssignmentExpression() {
		return assignmentExpression;
	}

	public void setAssignmentExpression(String assignmentExpression) {
		this.assignmentExpression = assignmentExpression;
	}

	public String getAssignmentInput() {
		return assignmentInput;
	}

	public void setAssignmentInput(String assignmentInput) {
		this.assignmentInput = assignmentInput;
	}

	public String getAssignmentOutput() {
		return assignmentOutput;
	}

	public void setAssignmentOutput(String assignmentOutput) {
		this.assignmentOutput = assignmentOutput;
	}

	public String getExistingKeysPreserved() {
		return existingKeysPreserved;
	}

	public void setExistingKeysPreserved(String existingKeysPreserved) {
		this.existingKeysPreserved = existingKeysPreserved;
	}

	public String getOverwriteExistingKey() {
		return overwriteExistingKey;
	}

	public void setOverwriteExistingKey(String overwriteExistingKey) {
		this.overwriteExistingKey = overwriteExistingKey;
	}

	public String getParallelAssignmentEnabled() {
		return parallelAssignmentEnabled;
	}

	public void setParallelAssignmentEnabled(String parallelAssignmentEnabled) {
		this.parallelAssignmentEnabled = parallelAssignmentEnabled;
	}

	public long getAssignmentPriority() {
		return assignmentPriority;
	}

	public void setAssignmentPriority(long assignmentPriority) {
		this.assignmentPriority = assignmentPriority;
	}

	public String getAssignmentStartTime() {
		return assignmentStartTime;
	}

	public void setAssignmentStartTime(String assignmentStartTime) {
		this.assignmentStartTime = assignmentStartTime;
	}

}
