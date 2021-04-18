def call (String pipelineToDelete) {
    // Results in 'deleteAdderPipeline'
    String currentMethodName = this.class.getSimpleName() - ".groovy"

    validatePipelineUserTarget(
        currentMethodName,
        ["delete-adder-pipeline"],
        ["adder-admin"],
        ["adder/premerge",
         "adder/postmerge",
         "adder/delete-me"],
        pipelineToDelete)

    def pipeline = Jenkins.instance.getItemByFullName(pipelineToDelete)
    
    pipeline.delete()
}
