FROM jenkins/jenkins:2.263.1-lts

RUN jenkins-plugin-cli --plugins \
    active-directory \
    cobertura \
    configuration-as-code \
    docker-plugin \
    docker-workflow \
    ghprb \
    junit

# From chapter 2
USER root
RUN  usermod -u 123 -g 30 jenkins
USER jenkins
