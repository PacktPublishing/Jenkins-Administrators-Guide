def call (String libMethodName,
          List<String> approvedPipelines,
          List<String> approvedUsers,
          List<String> approvedTargets,
          String target) {

    if (!approvedPipelines.contains(env.JOB_NAME))
        error("${env.JOB_NAME} is not approved to call\
               ${libMethodName} global shared library method")

    String userId = currentBuild.rawBuild.getCause(hudson.model.Cause$UserIdCause).userId
    if (!approvedUsers.contains(userId))
        error("${userId} is not approved to call\
               ${libMethodName} global shared library method")

    if (!approvedTargets.contains(target))
        error("${libMethodName} global shared library method\
               isn’t approved to be called with ${target}")
}
