def call(Closure steps_closure) {
    pipeline {
        agent none

        stages {
            stage('Get Docker group') {
                agent { label 'firewalled-firewalled-agent' }
                steps {
                    script {
                        docker_group = sh (
                            script: "stat -c '%g' /var/run/docker.sock",
                            returnStdout: true).trim()
                    }
                }
            }
            stage('Build') {
                agent {
                    docker {
                        label 'firewalled-firewalled-agent'
                        image 'docker:dind'
                        args "-v /var/run/docker.sock:/var/run/docker.sock:rw --group-add ${docker_group}"
                    }
                }
                steps {
                    script {
                        steps_closure.call()
                    }
                }
            }
        }
    }
}
