void call(String yamlSpec) {
    List<Map> spec = readYaml(text: yamlSpec)

    pipeline {
        agent any

        stages {
            stage("Init") {
                steps {
                    script {
                        for (Map stg in spec) {
                            makeStage(stg)
                        }
                    }
                }
            }
        }
    }
}

void makeStage(Map stg) {
    stage(stg.stage_name) {
        sh "${stg.build_cmd}"
    }
}
