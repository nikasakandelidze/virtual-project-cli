package inputProcessor.messages;

import service.help.HelpMessageConstants;

public enum InputMessageType {
    COUNT_WITH_EXTENSION(HelpMessageConstants.HELP_COUNT_WITH_EXTENSION, "ls -xc {arg?}"),
    LS_WITH_EXTENSION(HelpMessageConstants.HELP_LS_WITH_EXTENSION, "ls -x {arg}"),
    COUNT_ALL_EXTENSIONS(HelpMessageConstants.HELP_COUNT_WITH_EXTENSION, "find -xc"),
    GIT_USERS_COMMITS_COUNTS(HelpMessageConstants.GIT_COMMIT_COUNT, "commit count"),
    GIT_USERS_COMMITS_EDGES(HelpMessageConstants.GIT_COMMIT_EDGE, "commit edge"),
    GIT_USERS_COMMITS_DATE(HelpMessageConstants.GIT_COMMIT_DATE, "commit date"),
    TREE(HelpMessageConstants.TREE, "commit date"),
    HELP("", ""),
    EXIT(HelpMessageConstants.HELP_EXIT, "exit");

    private final String details;
    private final String command;

    InputMessageType(String details, String command) {
        this.details = details;
        this.command = command;
    }

    public String getDetails() {
        return details;
    }

    public String getCommand() {
        return command;
    }
}
