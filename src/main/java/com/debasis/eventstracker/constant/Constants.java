package com.debasis.eventstracker.constant;

/**
 * 
 * @author Debasis Panda
 *
 */
public final class Constants {

	private Constants() {
		
	}
	
	public static String EVENTS = "events";
	
	public static String[] EVENT_TYPES = new String[] { "CheckRunEvent", "CheckSuiteEvent", "CommitCommentEvent",
			"ContentReferenceEvent", "CreateEvent", "DeleteEvent", "DeployKeyEvent", "DeploymentEvent",
			"DeploymentStatusEvent", "DownloadEvent", "FollowEvent", "ForkEvent", "ForkApplyEvent",
			"GitHubAppAuthorizationEvent", "GistEvent", "GollumEvent", "InstallationEvent",
			"InstallationRepositoriesEvent", "IssueCommentEvent", "IssuesEvent", "LabelEvent",
			"MarketplacePurchaseEvent", "MemberEvent", "MembershipEvent", "MetaEvent", "MilestoneEvent",
			"OrganizationEvent", "OrgBlockEvent", "PageBuildEvent", "ProjectCardEvent", "ProjectColumnEvent",
			"ProjectEvent", "PublicEvent", "PullRequestEvent", "PullRequestReviewEvent",
			"PullRequestReviewCommentEvent", "PushEvent", "RegistryPackageEvent", "ReleaseEvent", "RepositoryEvent",
			"RepositoryImportEvent", "RepositoryVulnerabilityAlertEvent", "SecurityAdvisoryEvent", "StarEvent",
			"StatusEvent", "TeamEvent", "TeamAddEvent", "WatchEvent" };
	
}
