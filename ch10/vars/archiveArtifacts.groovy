void call(Map params = [:]) {
    error("archiveArtifacts step is disabled. " +
          "Use rtUpload instead to upload to Artifactory.")
}

/* A nicer way to handle the upload for the users instead of failing

void call(Map params = [:]) {
    unstable("archiveArtifacts step is disabled. " +
             "Uploading to the Artifactory instead.")

    rtUpload(
        serverId: 'artifactory',
        spec: '''{
        "files": [ {
            "pattern": params.artifacts,
            "target": "jenkins-artifacts/${env.BUILD_TAG}"
        } ] }'''
    )
}

*/